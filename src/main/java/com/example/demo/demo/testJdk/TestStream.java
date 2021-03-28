package com.example.demo.demo.testJdk;

import cn.hutool.core.date.DateUtil;
import com.example.demo.demo.testJdk.model.dto.UserDo;

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

        ArrayList<UserDo> users = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            UserDo user = new UserDo();
            user.setId(Long.valueOf(i));
            user.setUserName("dsdf" + i);
            user.setPassWords(11 + i);
            users.add(user);
        }
        List<Long> collect = users.stream().map(UserDo::getId).collect(Collectors.toList());
        //集合转map
        Map<Long, Integer> collect1 = users.stream().collect(Collectors.toMap(UserDo::getId, UserDo::getPassWords));
        Map<Long, UserDo> collect2 = users.stream().collect(Collectors.toMap(UserDo::getId, User -> User));
        List<UserDo> collect3 = users.stream().filter(a -> 0 == a.getId()).filter(a -> 11 == a.getPassWords()).collect(Collectors.toList());
        users.stream().sorted().collect(Collectors.toList());
        users.stream().sorted(Comparator.comparing(UserDo::getUserName)).collect(Collectors.toList());
    }


}
