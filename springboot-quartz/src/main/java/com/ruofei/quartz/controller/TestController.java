package com.ruofei.quartz.controller;

import cn.hutool.Hutool;
import cn.hutool.core.lang.UUID;
import com.ruofei.quartz.dto.QuartzJobDTO;
import com.ruofei.quartz.job.ExampleJob;
import com.ruofei.quartz.service.QuartzManagerService;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: srf
 * @Date: 2021/2/25 15:15
 * @description:
 */
@RestController
//@Api(tags = "任务管理")
@RequestMapping(value = "test", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    @Autowired(required = false)
    private QuartzManagerService service;

    @GetMapping("add")
    public void test() throws SchedulerException, ClassNotFoundException {
        QuartzJobDTO job = new QuartzJobDTO();
        job.setBeanClass(ExampleJob.class.getName());
        job.setCronExpression("0/10 * * * * ?");
        job.setJobName("test");
        job.setJobGroup(UUID.fastUUID().toString());
        job.setDescription("修改描述");
        job.setCreateTime(new Date());
        job.setCreator("Milla");
        job.setModifier("Milla's");
        service.addJob(job);
    }




}
