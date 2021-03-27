package com.example.demo;

import java.util.Date;

import cn.hutool.core.collection.CollectionUtil;
import com.example.demo.mybatisPlus.model.entity.User;
import com.example.demo.mybatisPlus.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @description: 用户表测试
 * @author: liujie
 * @title: UserTest
 * @date: 2021/3/27 16:58
 */
@SpringBootTest
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    void getUser() {
        List<User> list = userService.list();
        if (CollectionUtil.isNotEmpty(list)) {
            list.forEach(e -> {
                System.out.println("iuuuhhhhhhhhhhhhhh" + e);
            });
        }
    }

    @Test
    void insertUser() {
        User user = new User();
        user.setAuthor("ccc");
        user.setTitle("ccc");
        userService.saveOrUpdate(user);
    }

    @Test
    void updateUser() {
        User byId = userService.getById(4L);
        byId.setAuthor("dddddd");
        userService.saveOrUpdate(byId);
    }

    @Test
    void deleteUser() {
        userService.removeById(3L);
    }

}
