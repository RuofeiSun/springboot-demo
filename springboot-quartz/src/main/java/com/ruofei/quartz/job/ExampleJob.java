package com.ruofei.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Author: srf
 * @Date: 2021/2/25 14:52
 * @description:
 */
public class ExampleJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //此处是需要定时执行的业务
        System.out.println("就做个打印吧");


    }
}