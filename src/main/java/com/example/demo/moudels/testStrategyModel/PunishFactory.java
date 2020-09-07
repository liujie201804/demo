package com.example.demo.moudels.testStrategyModel;

import java.util.HashMap;

/**
 * @author daizhi
 * @version 1.0.0
 * @date 2019/10/17
 * @description：${description}
 */
public class PunishFactory {

    private static java.util.Map<String,IPunish> punishMap = new HashMap<String,IPunish>();

    private PunishFactory() {}

    private static final IPunish EMPTY = new EmptyPunish();

    //获取
    public static IPunish getPunish(String state) {
        IPunish result = punishMap.get(state);
        return result == null ? EMPTY : result;
    }

    //将处罚对象注册到这里
    public static void registerPunish(String state,IPunish o){
        punishMap.put(state, o);
    }

    private static class EmptyPunish implements IPunish {

        @Override
        public void exePunish() {
            System.out.println("默认实现方法！");
        }
    }
}
