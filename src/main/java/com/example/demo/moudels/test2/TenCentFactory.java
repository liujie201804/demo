package com.example.demo.moudels.test2;

import org.springframework.stereotype.Service;

/**
 * @author: jieliu
 * @title: UploadFactory
 * @description:
 * @date: 2020-05-09 11:02
 **/
@Service
public class TenCentFactory implements ProviderService {

    @Override
    public TestService2 execute() {
        return new TenCentTestServiceImpl2();
    }
}
