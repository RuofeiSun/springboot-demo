package com.ruofei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruofei.domain.UserEntity;
import com.ruofei.mapper.UserMapper;
import com.ruofei.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sunruofei
 * @since 2021-01-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}
