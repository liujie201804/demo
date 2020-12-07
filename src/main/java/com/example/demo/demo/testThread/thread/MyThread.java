package com.example.demo.demo.testThread.thread;

/**
 * @author: jieliu
 * @title: MyThread
 * @description:
 * @date: 2020-05-29 15:35
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                // 线程休眠
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName()
                    + "运行，i = " + i);  // 取得当前线程的名字
        }
    }
}
