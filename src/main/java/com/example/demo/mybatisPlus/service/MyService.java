package com.example.demo.mybatisPlus.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @description:
 * @author: liujie
 * @title: MyService
 * @date: 2021/1/8 16:36
 */
@WebService
public interface MyService {

    @WebMethod
    String show();
}
