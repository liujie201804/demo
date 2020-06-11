package com.example.demo.moudels.test1;


import com.example.demo.moudels.test1.model.TaskParam;

/**
 * @author: jieliu
 * @title: TestService
 * @description:
 * @date: 2020-05-09 10:06
 **/
public interface TestService {

    /**
     * @description: 上传
     * @param taskParam
     * @return:
     * @Author: jieliu
     * @Date: 2020/5/9
     */
    void upload(TaskParam taskParam);

    /**
     * @description:  下载
     * @param taskParam
     * @return:
     * @Author: jieliu
     * @Date: 2020/5/9
     */
    void download(TaskParam taskParam);
}
