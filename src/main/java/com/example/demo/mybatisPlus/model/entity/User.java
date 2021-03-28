package com.example.demo.mybatisPlus.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuJie
 * @since 2021-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;

    /**
     * 标题
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String title;

    /**
     * 作者
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String author;

    /**
     * 创建时间
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    /**
     * 版本号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Version
    private Long version;

    /**
     * 状态
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer status;

    /**
     * 逻辑删除备注：0 正常 ，1 删除
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @TableLogic
    @TableField(select = false)
    private Integer deleteStatus;


}
