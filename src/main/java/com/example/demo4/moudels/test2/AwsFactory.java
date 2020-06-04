package com.example.demo4.moudels.test2;

import org.springframework.stereotype.Service;

/**
 * @author: jieliu
 * @title: DownloadFactory
 * @description:
 * @date: 2020-05-09 11:02
 **/
@Service
public class AwsFactory implements ProviderService {


    @Override
    public TestService2 execute() {
        return new AwsTestServiceImpl2();
    }
}
