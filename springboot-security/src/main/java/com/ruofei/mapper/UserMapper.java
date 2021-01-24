package com.ruofei.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruofei.domain.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sunruofei
 * @since 2021-01-22
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
