package com.ruofei.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ruofei.domain.UserEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunruofei
 * @since 2021-01-22
 */
public interface UserService extends IService<UserEntity> {

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username,String password);

}
