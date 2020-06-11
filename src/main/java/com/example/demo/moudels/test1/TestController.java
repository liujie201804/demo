package com.example.demo.moudels.test1;

import com.example.demo.moudels.test1.model.TaskParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: jieliu
 * @title: TestController
 * @description: 简单工厂模式
 * @date: 2020-05-09 10:21
 **/
@Slf4j
@RestController
public class TestController {

    @Resource
    private TaskFactory taskFactory;

    @GetMapping("getTest")
    public void getTest(String code) {
        TaskParam taskParam = new TaskParam();
        TestService upload = taskFactory.upload(code);
        if (null == upload) {
            log.info("code 不存在");
            return;
        }
        upload.upload(taskParam);
    }

    @GetMapping("getTest1")
    public void getTest1(String code) {
        TaskParam taskParam = new TaskParam();
        TestService download = taskFactory.download(code);
        download.download(taskParam);
    }
}
