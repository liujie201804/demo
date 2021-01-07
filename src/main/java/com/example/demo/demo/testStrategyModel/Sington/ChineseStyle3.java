package com.example.demo.demo.testStrategyModel.Sington;

/**
 * 静态内部类实现单例模式
 * 该方法采用了类装载机制来保证初始化实例时只有一个线程
 * 静态内部类在Signleton类被装载时并不会立即实例化，而是需要实例化时，才会装载SignletonInstance类
 * 类的静态属性只会在第一次加载类的时候初始化
 * 避免了线程不安全，利用静态内部类实现懒加载，效率高
 * @author: liujie
 * @title: ChineseStyle3
 * @date: 2021/1/7 10:40
 */
public class ChineseStyle3 {

    private ChineseStyle3() {
    }
    //静态内部类，该类中有一个静态属性Signleton
    private static class ss {
        private final static ChineseStyle3 chineseStyle3 = new ChineseStyle3();
    }
    //提供一个静态的公有方法，直接返回SignletonInstance.instance
    public static ChineseStyle3 getInstance(){
        return ss.chineseStyle3;
    }
}
