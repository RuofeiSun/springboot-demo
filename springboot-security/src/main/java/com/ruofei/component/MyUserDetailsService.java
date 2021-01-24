/*
package com.ruofei.component;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ruofei.domain.*;
import com.ruofei.service.PermissionService;
import com.ruofei.service.RolePermissionService;
import com.ruofei.service.UserRoleService;
import com.ruofei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

*/
/**
 * @Author: srf
 * @Date: 2020/12/3 17:34
 * @description:
 *//*

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Autowired
    UserRoleService userRoleService;

    @Autowired
    RolePermissionService rolePermissionService;

    @Autowired
    PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);

        UserEntity user = userService.getOne(wrapper);
        if (user == null) {
            throw new UsernameNotFoundException("数据库中无此用户！");
        }
        //根据用户查询权限
        QueryWrapper<UserRoleEntity> userRoleWrapper = new QueryWrapper<>();
        userRoleWrapper.eq("sys_user_id",user.getId());
        List<UserRoleEntity> userRoles = userRoleService.list(userRoleWrapper);

        //根据角色获取访问资源
        QueryWrapper<RolePermissionEntity> rolePermissionWrapper = new QueryWrapper<>();
        rolePermissionWrapper.in("role_id",userRoles.stream().map(userRoleEntity -> userRoleEntity.getSysRoleId()).collect(Collectors.toList()));
        List<RolePermissionEntity> rolePermissions = rolePermissionService.list(rolePermissionWrapper);

        //获取最终能访问的资源
        QueryWrapper<PermissionEntity> permissionWrapper = new QueryWrapper<>();
        permissionWrapper.in("id",rolePermissions.stream().map(rolePermission -> rolePermission.getId()).collect(Collectors.toList()));

        List<PermissionEntity> resourceList = permissionService.list(permissionWrapper);

        MyUserBean userBean = new MyUserBean(user,resourceList);

        return userBean;
    }

}
*/
