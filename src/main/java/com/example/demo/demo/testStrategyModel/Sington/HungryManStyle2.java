package com.example.demo.demo.testStrategyModel.Sington;

/**
 * @description: 饿汉式
 * @author: liujie
 * @title: HungryManStyle2
 * @date: 2021/1/7 10:24
 */
public class HungryManStyle2 {

    private HungryManStyle2() {
    }

    private final static HungryManStyle2 HungryManStyle2;

    static {
        HungryManStyle2 = new HungryManStyle2();
    }

    public static HungryManStyle2 getHungryManStyle2(){
        return HungryManStyle2;
    }

}
