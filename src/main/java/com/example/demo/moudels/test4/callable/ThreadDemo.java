package com.example.demo.moudels.test4.callable;

import java.util.concurrent.Callable;

/**
 * @description:
 * @author: jieliu
 * @create: 2020-06-11 10:26
 **/
public class ThreadDemo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100000000; i++) {
            sum += i;
        }
        return sum;

    }
}
