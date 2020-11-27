package com.example.demo.listenter.rocketMq;

import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.moudels.testJdk.model.dto.User;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @description: mq相关测试接口
 * @author: jieliu
 * @title: produceTest
 * @date: 2020/11/27 13:36
 */
@Slf4j
@Api(tags = "mq相关测试接口")
@RestController
@RequestMapping("produce")
public class ProduceTest {

    @Resource
    private RocketMQTemplate rocketMqTemplate;

    @GetMapping("send")
    public void send() {

        User user = new User(22L, "22", 44);
        Message<User> keys = MessageBuilder.withPayload(user).setHeader("KEYS", IdUtil.simpleUUID()).build();
        //异步发送消息
        rocketMqTemplate.asyncSend("demoTopic"+":111", keys, new SendCallback() {

            @Override
            public void onSuccess(SendResult sendResult) {
                log.info("传输成功");
                log.info(JSON.toJSONString(sendResult));
            }

            @Override
            public void onException(Throwable e) {
                log.error("传输失败", e);
            }

        });
    }
}
