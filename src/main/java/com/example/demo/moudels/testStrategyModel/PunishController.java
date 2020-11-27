package com.example.demo.moudels.testStrategyModel;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 * @author jieliu
 * @date 2020/9/7 10:16
 * @return * @return null
 */
@Api(tags = "策略模式")
@RestController
@RequestMapping("/punish")
public class PunishController {

    @Autowired
    private EarlyPunish earlyPunish;

    @Autowired
    private LatePunish latePunish;

    @Autowired
    private SleepPunish sleepPunish;

    @GetMapping(value = "/test1")
    public void test1(String name){
        if (name.equals("earlyPunish")){
            earlyPunish.exePunish();
        } else if (name.equals("latePunish")){
            latePunish.exePunish();
        } else if (name.equals("sleepPunish")) {
            sleepPunish.exePunish();
        }
    }

    @GetMapping(value = "/test")
    public void test(String name){
        IPunish punish = PunishFactory.getPunish(name);
        punish.exePunish();
    }

//    @GetMapping(value = "/test2")
//    public void test2(String name){
//        IPunish iPunish = PunishManager.getPunishServices().get(name);
//        iPunish.exePunish();
//    }
}
