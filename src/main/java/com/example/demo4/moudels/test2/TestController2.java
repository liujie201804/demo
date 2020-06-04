package com.example.demo4.moudels.test2;

import com.example.demo.moudels.test1.TestService;
import com.example.demo.moudels.test1.model.TaskParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jieliu
 * @title: TestController2
 * @description:
 * @date: 2020-05-11 10:06
 **/
@Slf4j
@RestController
public class TestController2 {


    @GetMapping("getTest3")
    public String getTest3(String code) {
        TaskParam taskParam = new TaskParam();

        ProviderService awsFactory = new AwsFactory();

        TestService2 testService2 = awsFactory.execute();

        testService2.upload(taskParam);

        return "success";
    }

}
