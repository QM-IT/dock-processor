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

@TableName("instance_info")
public class InstanceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("actual_trigger_time")
    private Long actualTriggerTime;

    @TableField("app_id")
    private Long appId;

    @TableField("expected_trigger_time")
    private Long expectedTriggerTime;

    @TableField("finished_time")
    private Long finishedTime;

    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    @TableField("gmt_modified")
    private LocalDateTime gmtModified;

    @TableField("instance_id")
    private Long instanceId;

    @TableField("instance_params")
    private String instanceParams;

    @TableField("job_id")
    private Long jobId;

    @TableField("job_params")
    private String jobParams;

    @TableField("last_report_time")
    private Long lastReportTime;

    @TableField("result")
    private String result;

    @TableField("running_times")
    private Long runningTimes;

    @TableField("status")
    private Integer status;

    @TableField("task_tracker_address")
    private String taskTrackerAddress;

    @TableField("type")
    private Integer type;

    @TableField("wf_instance_id")
    private Long wfInstanceId;
}
