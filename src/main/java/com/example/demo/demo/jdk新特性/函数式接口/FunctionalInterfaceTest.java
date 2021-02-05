package com.example.demo.demo.jdk新特性.函数式接口;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: liujie
 * @title: FunctionalInterfaceTest
 * @date: 2021/1/22 15:14
 */
public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("LuoTianyan", 23));
        peopleList.add(new People("ff", 26));
        peopleList.add(new People("Tony", 33));
        List<People> filter = Filter.filter(peopleList, p -> ((People) p).getAge() > 25);
        filter.forEach(System.out::println);
    }

}