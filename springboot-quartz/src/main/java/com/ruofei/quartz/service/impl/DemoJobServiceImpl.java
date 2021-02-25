package com.ruofei.quartz.service.impl;

import com.ruofei.quartz.dto.QuartzJobDTO;
import com.ruofei.quartz.enums.QuartzJobStateEnum;
import com.ruofei.quartz.mapper.QuartzJobDTOMapper;
import com.ruofei.quartz.service.QuartzJobService;
import com.ruofei.quartz.util.QuartzManager;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Author: srf
 * @Date: 2021/2/25 16:05
 * @description:
 */
@Service
public class DemoJobServiceImpl implements QuartzJobService {


    @Autowired
    private QuartzManager quartzUtil;
    @Autowired
    private QuartzJobDTOMapper mapper;

    @Override
    public void initSchedule() throws SchedulerException, ClassNotFoundException {
        // 获取所有报告的定时任务
        List<QuartzJobDTO> jobList = mapper.selectJobByGroup("report");
        if (CollectionUtils.isEmpty(jobList)) {
            return;
        }
        for (QuartzJobDTO job : jobList) {
            if (QuartzJobStateEnum.RUNNING.getCode().equals(job.getJobStatus())) {
                quartzUtil.addJob(job);
            }
        }
    }
}
