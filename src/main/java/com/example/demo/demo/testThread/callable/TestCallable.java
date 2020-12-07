package com.example.demo.demo.testThread.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:
 * @author: jieliu
 * @create: 2020-06-11 10:27
 **/
public class TestCallable {

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        //1.执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。
        FutureTask<Integer> result = new FutureTask<>(td);
        new Thread(result).start();
        //2.接收线程运算后的结果
        try {
            //判断是否完成
            if (!result.isDone()) {
                System.out.println("-sorry-----------------------");
            }
            //FutureTask 可用于 闭锁 类似于CountDownLatch的作用，在所有的线程没有执行完成之后这里是不会执行的
            Integer sum = result.get();
            System.out.println(sum);
            System.out.println("------------------------------------");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
