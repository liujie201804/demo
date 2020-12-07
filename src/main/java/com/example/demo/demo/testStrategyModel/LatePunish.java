package com.example.demo.demo.testStrategyModel;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @author daizhi
 * @version 1.0.0
 * @date 2019/10/17
 * @description：${description}
 */
@Service("latePunish")
public class LatePunish extends ParentPunish implements IPunish, InitializingBean {

    @Override
    public void exePunish() {
        super.exePunish();
        System.out.println("迟到罚款100！");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PunishFactory.registerPunish("a", this);
    }
}
