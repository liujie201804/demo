//package com.example.demo.listenter.rocketMq;
//
//import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
//import org.apache.rocketmq.common.message.MessageQueue;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import java.util.Set;
//
///**
// * @description: 消费者配置
// * @author: jieliu
// * @title: Contumer
// * @date: 2020/11/27 16:02
// */
//@Component
//@Configuration
//public class ConsumerConfig {
//
//    @Bean
//    public DefaultMQPushConsumer setConsumer() throws MQClientException {
//        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer();
////        consumer.setNamesrvAddr("10.0.128.138:9876");
//        consumer.setConsumerGroup("demo");
//        //第一次启动从队列初始位置消费，后续再启动接着上次消费的进度开始消费
//        consumer.subscribe("demoTopic", "*");
//        return consumer;
//    }
//
//}
