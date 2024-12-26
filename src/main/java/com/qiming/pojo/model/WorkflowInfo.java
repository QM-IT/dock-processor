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
@TableName("workflow_info")
public class WorkflowInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("app_id")
    private Long appId;

    @TableField("extra")
    private String extra;

    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    @TableField("gmt_modified")
    private LocalDateTime gmtModified;

    @TableField("lifecycle")
    private String lifecycle;

    @TableField("max_wf_instance_num")
    private Integer maxWfInstanceNum;

    @TableField("next_trigger_time")
    private Long nextTriggerTime;

    @TableField("notify_user_ids")
    private String notifyUserIds;

    @TableField("pedag")
    private String pedag;

    @TableField("status")
    private Integer status;

    @TableField("time_expression")
    private String timeExpression;

    @TableField("time_expression_type")
    private Integer timeExpressionType;

    @TableField("wf_description")
    private String wfDescription;

    @TableField("wf_name")
    private String wfName;
}
