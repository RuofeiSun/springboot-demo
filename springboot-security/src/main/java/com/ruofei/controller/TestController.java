package com.ruofei.controller;

import com.ruofei.common.CommonResult;
import com.ruofei.domain.UserEntity;
import com.ruofei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: srf
 * @Date: 2021/1/23 19:00
 * @description:
 */
@RestController
@RequestMapping("/admin")
public class TestController {

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public CommonResult login(@RequestBody UserEntity user) {
        String token = userService.login(user.getUsername(), user.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

}
