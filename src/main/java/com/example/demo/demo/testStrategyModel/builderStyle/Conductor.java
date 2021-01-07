package com.example.demo.demo.testStrategyModel.builderStyle;

/**
 * @description: 指挥者
 * @author: liujie
 * @title: Conductor
 * @date: 2021/1/7 10:56
 */
public class Conductor {

    private ComputerBuilder computerBuilder;

    public Conductor(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    // 指挥建造过程
    public Computer make(){
        computerBuilder.buildMainBoard();
        computerBuilder.buildCpu();
        computerBuilder.buildHardDisk();
        computerBuilder.buildIdeoCard();
        computerBuilder.buildMemorie();
        return computerBuilder.build();
    }
}
