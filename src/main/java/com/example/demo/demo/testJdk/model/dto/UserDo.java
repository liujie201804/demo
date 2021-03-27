package com.example.demo.demo.testJdk.model.dto;

import lombok.AllArgsConstructor;
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
public class UserDo {

    private Long id;
    private String userName;
    private Integer passWords;
}
