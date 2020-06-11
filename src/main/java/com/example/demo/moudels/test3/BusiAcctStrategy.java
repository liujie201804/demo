package com.example.demo.moudels.test3;

/**
 * @author: jieliu
 * @title: BusiAcctStrategy
 * @description:
 * @date: 2020-05-11 13:36
 **/
public class BusiAcctStrategy implements Strategy{

    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        // TODO Auto-generated method stub
        return charge*0.90;

    }
}
