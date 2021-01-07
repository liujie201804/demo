package com.example.demo.demo.testStrategyModel.builderStyle;

/**
 * @description: 一台电脑需要完成的工序
 * @author: liujie
 * @title: ComputerBuilder
 * @date: 2021/1/7 10:53
 */
public interface ComputerBuilder {

    void buildMainBoard();

    void buildCpu();

    void buildIdeoCard();

    void buildHardDisk();

    void buildMemorie();

    // 建造结果
    Computer build();

}