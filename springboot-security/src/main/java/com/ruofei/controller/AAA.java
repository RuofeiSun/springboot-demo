package com.ruofei.controller;

import com.ruofei.common.CommonResult;
import com.ruofei.domain.UserEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: srf
 * @Date: 2021/1/24 20:34
 * @description:
 */
@RestController
@RequestMapping("/aaa")
public class AAA {

    @GetMapping("/getmsg")
    public CommonResult getmsg() {
        return CommonResult.success("success");
    }

}
