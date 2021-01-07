package com.example.demo.demo.testStrategyModel.builderStyle;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @description: A
 * @author: liujie
 * @title: ComputerA
 * @date: 2021/1/7 10:54
 */
public class ComputerA implements ComputerBuilder {

   private Computer computer = new Computer();

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("X550JK");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i5");
    }

    @Override
    public void buildIdeoCard() {
        computer.setIdeoCard("GTX1060");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("256GB+1TB混合硬盘");
    }

    @Override
    public void buildMemorie() {
        computer.setMemorie("DDR4 8GB×1");
    }

    @Override
    public Computer build() {
        return computer;
    }
}
