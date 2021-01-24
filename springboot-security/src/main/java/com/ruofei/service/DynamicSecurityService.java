package com.ruofei.service;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * @Author: srf
 * @Date: 2021/1/23 18:21
 * @description:
 */
public interface DynamicSecurityService {

    /**
     * 加载资源ANT通配符和资源对应MAP
     */
    Map<String, ConfigAttribute> loadDataSource();

}
