package com.example.demo4.moudels.test1;

import com.example.demo4.moudels.test1.model.TaskParam;
import org.springframework.stereotype.Service;

/**
 * @author: jieliu
 * @title: TenCentTestServiceImpl
 * @description:
 * @date: 2020-05-09 10:07
 **/
@Service
public class TenCentTestServiceImpl implements TestService {

    @Override
    public void upload(TaskParam taskParam) {
        System.out.println("执行TenCent上传");
    }

    @Override
    public void download(TaskParam taskParam) {
        System.out.println("执行TenCent下载");
    }
}
