package com.example.demo.moudels.test5;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @author daizhi
 * @version 1.0.0
 * @date 2019/10/17
 * @description：${description}
 */
@Service("earlyPunish")
public class EarlyPunish extends ParentPunish implements IPunish, InitializingBean {
    @Override
    public void exePunish() {
        super.exePunish();
        System.out.println("早退罚款300！");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PunishFactory.registerPunish("b", this);
    }
}
