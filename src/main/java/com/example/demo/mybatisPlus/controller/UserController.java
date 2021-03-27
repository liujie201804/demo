package com.example.demo.mybatisPlus.controller;


import com.example.demo.mybatisPlus.model.entity.User;
import com.example.demo.mybatisPlus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuJie
 * @since 2021-03-27
 */
@RestController
@RequestMapping("/mybatisPlus/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("getUser")
   public Object getUser(){
        List<User> list = userService.list();
        return list;
    }

}
