package com.example.demo4.moudels.test5;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @author daizhi
 * @version 1.0.0
 * @date 2019/10/17
 * @description：${description}
 */
@Service("sleepPunish")
public class SleepPunish extends ParentPunish implements IPunish, InitializingBean {

    @Override
    public void exePunish() {
        super.exePunish();
        System.out.println("睡觉罚款200！");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PunishFactory.registerPunish("c", this);
    }

}
