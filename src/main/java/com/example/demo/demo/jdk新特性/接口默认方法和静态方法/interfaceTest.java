package com.example.demo.demo.jdk新特性.接口默认方法和静态方法;

/**
 * @description:
 * @author: liujie
 * @title: interfaceTest
 * @date: 2021/1/22 15:34
 */
public interface interfaceTest {
    // static修饰符定义静态方法
    static void staticMethod() {
        System.out.println("接口中的静态方法");
    }

    // default修饰符定义默认方法
    default void defaultMethod() {
        System.out.println("接口中的默认方法");
    }
}
