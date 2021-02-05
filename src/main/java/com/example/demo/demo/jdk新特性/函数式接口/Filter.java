package com.example.demo.demo.jdk新特性.函数式接口;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: liujie
 * @title: Filter
 * @date: 2021/1/22 15:09
 */
public class Filter<T> {
    public static <T> List<T> filter(List<T> list, BooleanFunctionalInterface b){
        if (CollectionUtils.isEmpty(list)){
            return new ArrayList<>(0);
        }

        List<T> result = new ArrayList<>(list.size());
        for(int i=0; i<list.size(); i++){
            T t = list.get(i);
            if (b.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

}
