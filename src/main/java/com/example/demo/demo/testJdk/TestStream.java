package com.example.demo.demo.testJdk;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.system.JvmSpecInfo;
import cn.hutool.system.SystemUtil;
import com.example.demo.demo.testJdk.model.dto.User;
import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description: jdk1.8新特性
 * @author: jieliu
 * @title: TestStream
 * @date: 2020/9/7 10:21
 */
public class TestStream {

    public static void main(String[] args) {

//        IoUtil.copy()

        System.out.println("DateUtil.format(new Date(),\"yyyy-MM-dd\") = " + DateUtil.format(new Date(), "yyyy-MM-dd"));
        //向上取整
        System.out.println(Math.round(1.5));

        ArrayList<User> users = Lists.newArrayList();

        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId(Long.valueOf(i));
            user.setUserName("dsdf" + i);
            user.setPassWords(11 + i);
            users.add(user);
        }
        List<Long> collect = users.stream().map(User::getId).collect(Collectors.toList());
        //集合转map
        Map<Long, Integer> collect1 = users.stream().collect(Collectors.toMap(User::getId, User::getPassWords));
        Map<Long, User> collect2 = users.stream().collect(Collectors.toMap(User::getId, User -> User));
        List<User> collect3 = users.stream().filter(a -> 0 == a.getId()).filter(a -> 11 == a.getPassWords()).collect(Collectors.toList());
        users.stream().sorted().collect(Collectors.toList());
        users.stream().sorted(Comparator.comparing(User::getUserName)).collect(Collectors.toList());
    }


}
