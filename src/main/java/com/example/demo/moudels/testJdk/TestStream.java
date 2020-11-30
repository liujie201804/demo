package com.example.demo.moudels.testJdk;

import com.example.demo.moudels.testJdk.model.dto.User;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: jdk1.8新特性
 * @author: jieliu
 * @title: TestStream
 * @date: 2020/9/7 10:21
 */
public class TestStream {

    public static void main(String[] args) {
        ArrayList<User> users = Lists.newArrayList();

        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId(Long.valueOf(i));
            user.setUserName("dsdf" + i);
            user.setPassWords(11 + i);
            users.add(user);
        }

        List<Long> collect = users.stream().map(User:: getId).collect(Collectors.toList());
        Map<Long, Integer> collect1 = users.stream().collect(Collectors.toMap(User::getId, User::getPassWords));
        Map<Long, User> collect2 = users.stream().collect(Collectors.toMap(User::getId, User -> User));
        List<User> collect3 = users.stream().filter(a -> 0 == a.getId()).filter(a -> 11 == a.getPassWords()).collect(Collectors.toList());
        users.stream().sorted().collect(Collectors.toList());
        users.stream().sorted(Comparator.comparing(User::getUserName)).collect(Collectors.toList());
    }


}
