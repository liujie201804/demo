package com.example.demo4.moudels.test4;

/**
 * @author: jieliu
 * @title: MyThread
 * @description:
 * @date: 2020-05-29 15:35
 **/
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(1000); // 线程休眠
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName()
                    + "运行，i = " + i);  // 取得当前线程的名字
        }
    }
}
