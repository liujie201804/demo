package com.example.demo.mybatisPlus.service.impl;

import com.example.demo.mybatisPlus.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @description:
 * @author: liujie
 * @title: MyServiceImpl
 * @date: 2021/1/8 16:37
 */
@WebService(serviceName = "fileDeviceService",//对外发布的服务名
        targetNamespace = "http://service.webservice.cj.com",//指定你想要的名称空间，通常使用使用包名反转
        endpointInterface = "com.example.demo.mybatisPlus.service.MyService")
@Service
@Slf4j
public class MyServiceImpl implements MyService {

    @Override
    public String show() {
        log.info("MyServiceImpl中的show方法被调用！" + "name");
        System.out.println("MyServiceImpl中的show方法被调用！");
        return "【调用成功！】";
    }
}
