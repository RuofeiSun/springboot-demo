package com.ruofei.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.ruofei.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: srf
 * @Date: 2021/5/14 15:42
 * @description:
 */
@RestController
public class TestController {

    @Autowired
    private TestService service;


    @GetMapping(value = "/hello/{name}")
    public String apiHello(@PathVariable String name) {
        return service.sayHello(name);
    }
}
