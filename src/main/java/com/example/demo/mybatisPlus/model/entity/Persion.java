package com.example.demo.mybatisPlus.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuJie
 * @since 2020-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Persion implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String first;

    private String last;

    private LocalDate dateofbirth;

    private String placeofbirth;


}
