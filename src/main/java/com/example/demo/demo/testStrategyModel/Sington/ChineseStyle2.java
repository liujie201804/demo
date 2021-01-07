package com.example.demo.demo.testStrategyModel.Sington;

/**
 * 懒汉模式-双重检查
 * 进行了两次if判断检查，这样就保证线程安全了
 * 通过判断是否为空，来确定是否 需要再次实例化
 * @author: liujie
 * @title: ChineseStyle2
 * @date: 2021/1/7 10:35
 */
public class ChineseStyle2 {

    private ChineseStyle2() {
    }

    private static volatile ChineseStyle2 chineseStyle2;

    public static ChineseStyle2 getChineseStyle2(){
        if (chineseStyle2 == null) {
            synchronized (ChineseStyle2.class){
                if (chineseStyle2 == null) {
                    return new ChineseStyle2();
                }
            }
        }
        return chineseStyle2;
    }
}
