package com.example.demo.moudels.test3;

/**
 * @author: jieliu
 * @title: CardStrategy
 * @description:
 * @date: 2020-05-11 13:37
 **/
public class CardStrategy implements Strategy{

    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge+charge*0.01;
    }
}
