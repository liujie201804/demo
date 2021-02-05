package com.example.demo.mybatisPlus.model.dto;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @description:
 * @author: liujie
 * @title: DataDto
 * @date: 2021/1/18 15:26
 */
@NoArgsConstructor
@Data
public class DataDto {
    /**
     * data : [{"callNo":378,"description":"这是一段描述","editable":false,"id":1,"key":1,"no":"No 1","status":2,"updatedAt":"1996-04-23 22:24:11"}]
     * code : 0
     * message :
     * timestamp : 1610953546297
     */
    private int code = 1;
    private String message = "消息";
    private long timestamp = 235423435;
    private List<DataBean> data ;

    public List<DataBean> getData() {
        List<DataBean> objects = Lists.newArrayList();
        objects.add(new DataBean());
        return objects;
    }
}
