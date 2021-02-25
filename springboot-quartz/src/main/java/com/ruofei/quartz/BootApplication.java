package com.ruofei.quartz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: srf
 * @Date: 2021/1/22 14:09
 * @description:
 */
@SpringBootApplication
@MapperScan(basePackages ="com.ruofei.quartz.mapper")
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

}
