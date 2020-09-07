//package com.example.demo.config;
//
//import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
//import com.alibaba.rocketmq.client.exception.MQClientException;
//import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;
//import com.example.demo.listenter.MQConsumeMsgListenerProcessor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.context.annotation.Bean;
//
///**
// * @author jieliu
// * @Title: MQConsumerConfiguration
// * @Description: TODO
// * @date 2019/10/14 14:49
// */
//@Slf4j
//@SpringBootConfiguration
//public class MQConsumerConfiguration {
//
//    @Value("${rocketmq.consumer.namesrvAddr}")
//    private String namesrvAddr;
//
//    @Value("${rocketmq.consumer.groupName}")
//    private String groupName;
//
//    @Value("${rocketmq.consumer.consumeThreadMin}")
//    private int consumeThreadMin;
//
//    @Value("${rocketmq.consumer.consumeThreadMax}")
//    private int consumeThreadMax;
//
//    @Value("${rocketmq.consumer.topics}")
//    private String topics;
//
//    @Value("${rocketmq.consumer.consumeMessageBatchMaxSize}")
//    private int consumeMessageBatchMaxSize;
//
//    @Autowired
//    private MQConsumeMsgListenerProcessor mqMessageListenerProcessor;
//
//    @Bean
//    public DefaultMQPushConsumer getRocketMQConsumer() {
//        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(groupName);
//        consumer.setNamesrvAddr(namesrvAddr);
//        consumer.setConsumeThreadMin(consumeThreadMin);
//        consumer.setConsumeThreadMax(consumeThreadMax);
//        consumer.registerMessageListener(mqMessageListenerProcessor);
//        /**
//         * 设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费
//         * 如果非第一次启动，那么按照上次消费的位置继续消费
//         */
//        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
//        /**
//         * 设置消费模型，集群还是广播，默认为集群
//         */
//        //consumer.setMessageModel(MessageModel.CLUSTERING);
//        /**
//         * 设置一次消费消息的条数，默认为1条
//         */
//        consumer.setConsumeMessageBatchMaxSize(consumeMessageBatchMaxSize);
//        try {
//            /**
//             * 设置该消费者订阅的主题和tag，如果是订阅该主题下的所有tag，则tag使用*；如果需要指定订阅该主题下的某些tag，则使用||分割，例如tag1||tag2||tag3
//             */
//            String[] topicTagsArr = topics.split(";");
//            for (String topicTags : topicTagsArr) {
//                String[] topicTag = topicTags.split("~");
//                consumer.subscribe(topicTag[0], topicTag[1]);
//            }
//            consumer.start();
//            log.info("consumer is start !!! groupName:{},topics:{},namesrvAddr:{}", groupName, topics, namesrvAddr);
//        } catch (MQClientException e) {
//            log.error("consumer is start !!! groupName:{},topics:{},namesrvAddr:{}", groupName, topics, namesrvAddr, e);
//        }
//        return consumer;
//    }
//}