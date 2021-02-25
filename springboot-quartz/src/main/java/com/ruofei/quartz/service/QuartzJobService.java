package com.ruofei.quartz.service;

import org.quartz.SchedulerException;

/**
 * @Author: srf
 * @Date: 2021/2/25 14:55
 * @description:
 */
public interface QuartzJobService {
    void initSchedule() throws SchedulerException, ClassNotFoundException;

}
