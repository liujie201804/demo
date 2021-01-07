package com.example.demo.demo.testStrategyModel.Sington;

/**
 * @description: 饿汉式
 * @author: liujie
 * @title: HungryManStyle
 * @date: 2021/1/7 10:20
 */
public class HungryManStyle1 {

    private final static HungryManStyle1 hungryManStyle = new HungryManStyle1();

    private HungryManStyle1() {
    }

    public static HungryManStyle1 getHungryManStyle(){
        return hungryManStyle;
    }

}
