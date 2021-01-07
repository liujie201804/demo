package com.example.demo.demo.testStrategyModel.Sington;

/**
 * @description: 饱汉式 (synchronized是一个很重量的同步锁，
 * 而我们每次执行getInstance()时都会进行同步，极其影响效率)
 * @author: liujie
 * @title: ChineseStyle
 * @date: 2021/1/7 10:30
 */
public class ChineseStyle1 {

    private ChineseStyle1() {
    }

    private static ChineseStyle1 chineseStyle1 ;

    public static synchronized ChineseStyle1 getChineseStyle1() {
        if (chineseStyle1 == null) {
            return new ChineseStyle1();
        }
        return chineseStyle1;
    }
}
