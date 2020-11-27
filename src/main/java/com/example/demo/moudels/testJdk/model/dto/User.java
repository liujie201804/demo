package com.example.demo.moudels.testJdk.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 用户
 * @author: jieliu
 * @title: Uer
 * @date: 2020/9/7 10:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String userName;
    private Integer passWords;
}
