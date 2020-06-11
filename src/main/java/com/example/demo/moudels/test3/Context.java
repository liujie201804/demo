package com.example.demo.moudels.test3;

/**
 * @author: jieliu
 * @title: Context
 * @description:
 * @date: 2020-05-11 13:38
 **/
public class Context {

    private Strategy strategy;

    public Double calRecharge(Double charge, Integer type) {
        strategy = StrategyFactory.getInstance().creator(type);
        return strategy.calRecharge(charge, RechargeTypeEnum.valueOf(type));

    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
