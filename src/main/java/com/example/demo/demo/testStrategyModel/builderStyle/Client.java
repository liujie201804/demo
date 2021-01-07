package com.example.demo.demo.testStrategyModel.builderStyle;

/**
 * @description:
 * @author: liujie
 * @title: Client
 * @date: 2021/1/7 10:58
 */
public class Client {
    public static void main(String[] args) {

        Conductor conductor = new Conductor(new ComputerA());
        Computer make = conductor.make();
        System.out.println(make);
    }
}
