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
 * @Date: 2021/2/25 14:55
 * @description:
 */

@Service("defalt")
public class QuartzJobServiceImpl implements QuartzJobService {

    @Override
    public void initSchedule() throws SchedulerException, ClassNotFoundException {


    }

}
