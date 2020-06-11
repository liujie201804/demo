package com.example.demo.moudels.test2;

import com.example.demo.moudels.test1.model.TaskParam;
import org.springframework.stereotype.Service;

/**
 * @author: jieliu
 * @title: AwsTestServiceImpl
 * @description:
 * @date: 2020-05-09 10:07
 **/
@Service
public class AwsTestServiceImpl2 implements TestService2 {

    @Override
    public void upload(TaskParam taskParam) {
        System.out.println("执行AWS上传");

    }

    @Override
    public void download(TaskParam taskParam) {
        System.out.println("执行AWS下载");
    }
}
