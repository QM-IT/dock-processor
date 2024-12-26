package com.qiming.pojo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Wang QiMing
 * @since 2024-12-26
 */
@Data
@TableName("user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("account_type")
    private String accountType;

    @TableField("email")
    private String email;

    @TableField("extra")
    private String extra;

    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    @TableField("gmt_modified")
    private LocalDateTime gmtModified;

    @TableField("nick")
    private String nick;

    @TableField("origin_username")
    private String originUsername;

    @TableField("password")
    private String password;

    @TableField("phone")
    private String phone;

    @TableField("status")
    private Integer status;

    @TableField("token_login_verify_info")
    private String tokenLoginVerifyInfo;

    @TableField("username")
    private String username;

    @TableField("web_hook")
    private String webHook;
}
