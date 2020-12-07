//package com.example.demo.moudels.testThread.BlockingQueue;
//
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.LinkedBlockingQueue;
//
///**
// * @description:
// * @author: jieliu
// * @create: 2020-06-11 14:29
// **/
//@Component
//public class TestManager {
//
//    private static LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue();
//
//    public void addInt(Integer args) throws InterruptedException {
//        blockingQueue.put(args);
//    }
//
//    public TestManager() throws Exception {
//        getTest();
//    }
//
//    public void getTest() throws Exception {
//        Integer take = blockingQueue.take();
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.execute(() -> {
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//
//            }
//            System.out.println("打印数据" + take);
//        });
//    }
//}
