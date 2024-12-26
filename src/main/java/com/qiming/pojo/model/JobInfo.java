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
@TableName("job_info")
public class JobInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("advanced_runtime_config")
    private String advancedRuntimeConfig;

    @TableField("alarm_config")
    private String alarmConfig;

    @TableField("app_id")
    private Long appId;

    @TableField("concurrency")
    private Integer concurrency;

    @TableField("designated_workers")
    private String designatedWorkers;

    @TableField("dispatch_strategy")
    private Integer dispatchStrategy;

    @TableField("dispatch_strategy_config")
    private String dispatchStrategyConfig;

    @TableField("execute_type")
    private Integer executeType;

    @TableField("extra")
    private String extra;

    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    @TableField("gmt_modified")
    private LocalDateTime gmtModified;

    @TableField("instance_retry_num")
    private Integer instanceRetryNum;

    @TableField("instance_time_limit")
    private Long instanceTimeLimit;

    @TableField("job_description")
    private String jobDescription;

    @TableField("job_name")
    private String jobName;

    @TableField("job_params")
    private String jobParams;

    @TableField("lifecycle")
    private String lifecycle;

    @TableField("log_config")
    private String logConfig;

    @TableField("max_instance_num")
    private Integer maxInstanceNum;

    @TableField("max_worker_count")
    private Integer maxWorkerCount;

    @TableField("min_cpu_cores")
    private Double minCpuCores;

    @TableField("min_disk_space")
    private Double minDiskSpace;

    @TableField("min_memory_space")
    private Double minMemorySpace;

    @TableField("next_trigger_time")
    private Long nextTriggerTime;

    @TableField("notify_user_ids")
    private String notifyUserIds;

    @TableField("processor_info")
    private String processorInfo;

    @TableField("processor_type")
    private Integer processorType;

    @TableField("status")
    private Integer status;

    @TableField("tag")
    private String tag;

    @TableField("task_retry_num")
    private Integer taskRetryNum;

    @TableField("time_expression")
    private String timeExpression;

    @TableField("time_expression_type")
    private Integer timeExpressionType;
}
