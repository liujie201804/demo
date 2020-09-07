package com.example.demo.moudels.testThread.BlockingQueue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @description:
 * @author: jieliu
 * @create: 2020-06-11 14:05
 **/
@RestController
@RequestMapping("/test4")
public class TestController {

    @Resource
    private TestManager testManager;

    @GetMapping("/getTe")
    public void getTe(Integer num){
        System.out.println(num);
        for (int i = 0; i < num; i++) {
            try {
                testManager.addInt(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
