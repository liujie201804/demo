package com.example.demo.mybatisPlus.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @author jieliu
 */
@Component
public class TestHandler {

    @XxlJob(value = "demoJobHandler")
    public ReturnT<String> execute(String name) {
        System.out.println("执行了TestHandler一次");
        return ReturnT.SUCCESS;
    }
}