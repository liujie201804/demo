package com.example.demo.mybatisPlus.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: liujie
 * @title: DataBean
 * @date: 2021/1/18 15:27
 */
@NoArgsConstructor
@Data
public class DataBean {
    /**
     * callNo : 378
     * description : 这是一段描述
     * editable : false
     * id : 1
     * key : 1
     * no : No 1
     * status : 2
     * updatedAt : 1996-04-23 22:24:11
     */

    private int callNo =1;
    private String description = "描述";
    private boolean editable = true;
    private int id = 12;
    private int key = 11;
    private String no = "no";
    private int status = 1;
    private String updatedAt = "更新时间";
}
