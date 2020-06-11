package com.example.demo.moudels.test1;

import org.springframework.stereotype.Component;

/**
 * @author: jieliu
 * @title: TaskFactory
 * @description:
 * @date: 2020-05-09 10:10
 **/
@Component
public class TaskFactory {

    public TestService upload(String source) {

        if (VendorTypeEnum.VENDOR_COS.getCode().equals(source)) {
            return new AwsTestServiceImpl();
        } else if (VendorTypeEnum.VENDOR_S3.getCode().equals(source)) {
            return new TenCentTestServiceImpl();
        }
        return null;
    }

    public TestService download(String source) {

        if (VendorTypeEnum.VENDOR_COS.getCode().equals(source)) {
            return new AwsTestServiceImpl();
        } else if (VendorTypeEnum.VENDOR_S3.getCode().equals(source)) {
            return new TenCentTestServiceImpl();
        }
        return null;
    }
}
