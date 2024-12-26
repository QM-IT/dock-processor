package com.qiming.pojo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Setter;

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

@TableName("container_info")
public class ContainerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("app_id")
    private Long appId;

    @TableField("container_name")
    private String containerName;

    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    @TableField("gmt_modified")
    private LocalDateTime gmtModified;

    @TableField("last_deploy_time")
    private LocalDateTime lastDeployTime;

    @TableField("source_info")
    private String sourceInfo;

    @TableField("source_type")
    private Integer sourceType;

    @TableField("status")
    private Integer status;

    @TableField("version")
    private String version;
}
