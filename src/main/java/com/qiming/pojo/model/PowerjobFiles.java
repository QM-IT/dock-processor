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
@TableName("powerjob_files")
public class PowerjobFiles implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 分桶
     */
    @TableField("bucket")
    private String bucket;

    /**
     * 文件名称
     */
    @TableField("name")
    private String name;

    /**
     * 版本
     */
    @TableField("version")
    private String version;

    /**
     * 元数据
     */
    @TableField("meta")
    private String meta;

    /**
     * 长度
     */
    @TableField("length")
    private Long length;

    /**
     * 状态
     */
    @TableField("status")
    private Integer status;

    /**
     * 文件内容
     */
    @TableField("data")
    private byte[] data;

    /**
     * 其他信息
     */
    @TableField("extra")
    private String extra;

    /**
     * 创建时间
     */
    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    /**
     * 更新时间
     */
    @TableField("gmt_modified")
    private LocalDateTime gmtModified;
}
