package com.ruofei.quartz.service;

import com.ruofei.quartz.dto.QuartzJobDTO;
import com.ruofei.quartz.enums.QuartzJobOperateEnum;
import org.quartz.SchedulerException;

/**
 * @Author: srf
 * @Date: 2021/2/25 14:48
 * @description:
 */
public interface QuartzManagerService {

    void addJob(QuartzJobDTO job) throws ClassNotFoundException, SchedulerException;

    void modifyJob(Integer id, QuartzJobOperateEnum operateEnum, QuartzJobDTO job) throws SchedulerException;

    void removeJob(Integer id) throws SchedulerException;


}
