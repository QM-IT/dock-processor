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
@TableName("workflow_instance_info")
public class WorkflowInstanceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("actual_trigger_time")
    private Long actualTriggerTime;

    @TableField("app_id")
    private Long appId;

    @TableField("dag")
    private String dag;

    @TableField("expected_trigger_time")
    private Long expectedTriggerTime;

    @TableField("finished_time")
    private Long finishedTime;

    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    @TableField("gmt_modified")
    private LocalDateTime gmtModified;

    @TableField("parent_wf_instance_id")
    private Long parentWfInstanceId;

    @TableField("result")
    private String result;

    @TableField("status")
    private Integer status;

    @TableField("wf_context")
    private String wfContext;

    @TableField("wf_init_params")
    private String wfInitParams;

    @TableField("wf_instance_id")
    private Long wfInstanceId;

    @TableField("workflow_id")
    private Long workflowId;
}
