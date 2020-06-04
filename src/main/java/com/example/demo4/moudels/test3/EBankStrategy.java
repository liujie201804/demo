package com.example.demo4.moudels.test3;

/**
 * @author: jieliu
 * @title: EBankStrategy
 * @description:
 * @date: 2020-05-11 13:36
 **/
public class EBankStrategy implements Strategy{

    @Override

    public Double calRecharge(Double charge, RechargeTypeEnum type) {

        return charge*0.85;

    }
}
