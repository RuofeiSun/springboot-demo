package com.ruofei.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author sunruofei
 * @since 2021-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user_role")
public class UserRoleEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer sysUserId;

    private Integer sysRoleId;


}
