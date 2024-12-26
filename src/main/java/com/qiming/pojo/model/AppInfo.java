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
@TableName("app_info")
public class AppInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("app_name")
    private String appName;

    @TableField("creator")
    private Long creator;

    @TableField("current_server")
    private String currentServer;

    @TableField("extra")
    private String extra;

    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    @TableField("gmt_modified")
    private LocalDateTime gmtModified;

    @TableField("modifier")
    private Long modifier;

    @TableField("namespace_id")
    private Long namespaceId;

    @TableField("password")
    private String password;

    @TableField("tags")
    private String tags;

    @TableField("title")
    private String title;
}
