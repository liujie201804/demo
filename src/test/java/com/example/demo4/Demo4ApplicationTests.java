package com.example.demo4;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo4ApplicationTests {

    /**使用RocketMq的生产者*/
    @Autowired
    private DefaultMQProducer defaultMQProducer;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void send() throws MQClientException, RemotingException, MQBrokerException, InterruptedException{
        String msg = "demo msg test";
        log.info("开始发送消息："+msg);
        Message sendMsg = new Message("ams-audit-ready","DemoTag2",msg.getBytes());
        sendMsg.setBuyerId("rrrrrrrrrr");
        //默认3秒超时
        SendResult sendResult = defaultMQProducer.send(sendMsg);
        log.info("消息发送响应信息："+sendResult.toString());
    }

    @Test
    public void getRedis() {
        Boolean fcd7787 = stringRedisTemplate.hasKey("e3052cd0d6a400cdbfebbb631fcd7787");
        if (fcd7787) {
            log.info("key存在！");
        }
    }
}
