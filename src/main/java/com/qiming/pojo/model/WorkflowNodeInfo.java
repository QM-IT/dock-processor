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
@TableName("workflow_node_info")
public class WorkflowNodeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("app_id")
    private Long appId;

    @TableField("enable")
    private Boolean enable;

    @TableField("extra")
    private String extra;

    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    @TableField("gmt_modified")
    private LocalDateTime gmtModified;

    @TableField("job_id")
    private Long jobId;

    @TableField("node_name")
    private String nodeName;

    @TableField("node_params")
    private String nodeParams;

    @TableField("skip_when_failed")
    private Boolean skipWhenFailed;

    @TableField("type")
    private Integer type;

    @TableField("workflow_id")
    private Long workflowId;
}
