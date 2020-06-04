package com.example.demo4.moudels.test1.model;

import lombok.Data;

/**
 * @author jieliu
 * @Title: CosTransferParam
 * @Description: 业务类
 * @date 2019/12/9 18:06
 */
@Data
public class TaskParam {

    /**
     * id
     */
    private Long id;

    /**
     * 本地地址
     */
    private String mountPoint;

    /**
     * 源文件路径
     */
    private String sourcePath;

    /**
     * 目标文件路径
     */
    private String targetPath;

    /**
     * 重试次数
     */
    private int retryCount;

}
