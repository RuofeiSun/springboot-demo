/*
package com.ruofei.service.impl;

import com.ruofei.domain.PermissionEntity;
import com.ruofei.service.DynamicSecurityService;
import com.ruofei.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

*/
/**
 * @Author: srf
 * @Date: 2021/1/22 15:16
 * @description:动态权限相关业务类
 *//*

@Service
public class DynamicSecurityServiceImpl implements DynamicSecurityService {

    @Autowired
    PermissionService permissionService;

    */
/**
     * 加载资源ANT通配符和资源对应MAP
     *//*

    @Override
    public Map<String, ConfigAttribute> loadDataSource() {
        Map<String, ConfigAttribute> map = new ConcurrentHashMap<>();
        List<PermissionEntity> resourceList = permissionService.list();
        for (PermissionEntity resource : resourceList) {
            map.put(resource.getUrl(), new org.springframework.security.access.SecurityConfig(resource.getId() + ":" + resource.getName()));
        }
        return map;
    }
}
*/
