package com.example.demo.listenter.rocketMq;

import com.example.demo.moudels.testJdk.model.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @description: 监听mq
 * @author: jieliu
 * @title: TransactionListener
 * @date: 2020/11/27 13:31
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "demoTopic", consumerGroup = "demo",selectorExpression = "111")
public class TransactionListener implements RocketMQListener<User> {

    @Override
    public void onMessage(User message) {
        log.info("消费消息,{}",message);
    }
}
