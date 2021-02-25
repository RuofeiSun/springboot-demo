package com.ruofei.quartz.service.impl;

import com.ruofei.quartz.dto.QuartzJobDTO;
import com.ruofei.quartz.enums.QuartzJobOperateEnum;
import com.ruofei.quartz.enums.QuartzJobStateEnum;
import com.ruofei.quartz.mapper.QuartzJobDTOMapper;
import com.ruofei.quartz.service.QuartzManagerService;
import com.ruofei.quartz.util.QuartzManager;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;


/**
 * @Author: srf
 * @Date: 2021/2/25 14:49
 * @description:
 */

@Service
//在微服务中，该类按需启用使用下面的注解，该类能完成自动注入和不注入
//@ConditionalOnProperty(prefix = "mybatis-plus", name = "quarzt-enable", havingValue = "1")
public class QuartzManagerServiceImpl implements QuartzManagerService {

    @Autowired
    private QuartzManager manager;

    @Autowired
    private QuartzJobDTOMapper mapper;

    @Override
    @Transactional
    public void addJob(QuartzJobDTO job) throws ClassNotFoundException, SchedulerException {
        Assert.hasText(job.getJobName(), "任务名称不能为空");
        Assert.hasText(job.getCronExpression(), "任务执行周期不能为空");
        Assert.hasText(job.getJobGroup(), "任务分组不能为空");
        QuartzJobDTO find = mapper.selectByJobName(job);
        Assert.isNull(find, "要添加的任务已经存在");
        mapper.insertSelective(job);
        manager.addJob(job);
    }

    @Override
    public void modifyJob(Integer id, QuartzJobOperateEnum operateEnum, QuartzJobDTO job) throws SchedulerException {


        QuartzJobDTO find = mapper.selectByPrimaryKey(id);
        Assert.notNull(find, "要操作的任务不存在");
        if (StringUtils.hasText(job.getJobName())) {
            find.setJobName(job.getJobName());
        }
        if (StringUtils.hasText(job.getJobGroup())) {
            find.setJobGroup(job.getJobGroup());
        }
        if (StringUtils.hasText(job.getBeanClass())) {
            find.setBeanClass(job.getBeanClass());
        }
        if (StringUtils.hasText(job.getModifier())) {
            find.setModifier(job.getModifier());
        }
        switch (operateEnum) {
            //删除
            case stop:
                find.setJobStatus(QuartzJobStateEnum.STOPPED.getCode());
                manager.pauseJob(find);
                break;
            case resume:
                find.setJobStatus(QuartzJobStateEnum.RUNNING.getCode());
                manager.resumeJob(find);
                break;
            case update:
                if (StringUtils.isEmpty(job.getCronExpression())) {
                    throw new RuntimeException("任务表达式书写错误");
                }
                find.setCronExpression(job.getCronExpression());
                manager.updateJobCron(find);
                break;
            default:
                throw new RuntimeException("任务不支持该操作");
        }
        mapper.updateByPrimaryKeySelective(find);
    }

    @Override
    public void removeJob(Integer id) throws SchedulerException {
        QuartzJobDTO find = mapper.selectByPrimaryKey(id);
        Assert.notNull(find, "要操作的任务不存在");
        find.setJobStatus("-1");
        mapper.updateByPrimaryKeySelective(find);
        manager.deleteJob(find);
    }


}
