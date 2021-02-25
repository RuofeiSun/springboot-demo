package com.ruofei.quartz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruofei.quartz.dto.QuartzJobDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: srf
 * @Date: 2021/2/25 14:29
 * @description:
 */

@Mapper
public interface QuartzJobDTOMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(QuartzJobDTO record);

    int insertSelective(QuartzJobDTO record);

    QuartzJobDTO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuartzJobDTO record);

    int updateByPrimaryKey(QuartzJobDTO record);

    List<QuartzJobDTO> selectJob();

    List<QuartzJobDTO> selectJobByGroup(@Param("report") String report);

    QuartzJobDTO selectByJobName(QuartzJobDTO job);


}
