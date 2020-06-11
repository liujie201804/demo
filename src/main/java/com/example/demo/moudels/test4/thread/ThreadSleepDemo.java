package com.example.demo.moudels.test4.thread;

import com.example.demo.moudels.test4.thread.MyThread;

/**
 * @author: jieliu
 * @title: ThreadSleepDemo
 * @description:
 * @date: 2020-05-29 15:36
 **/
public class ThreadSleepDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread,"线程").start();
    }
}
