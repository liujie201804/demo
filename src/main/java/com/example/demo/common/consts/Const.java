package com.example.demo.common.consts;

import java.util.HashMap;

/**
 * @author: liujie
 * @title: Const
 * @description: 常量类
 * @date: 2020-04-08 10:45
 **/
public class Const {

    /**
     * 请求header带的jwt信息
     */
    public static final String X_ACCESS_TOKEN = "X-Token";

    /**
     * 登录用户redis存储key前缀
     */
    public static final String PREFIX_USER_TOKEN = "PREFIX_USER_TOKEN_";


    /**
     * {@code 200 OK} (HTTP/1.0 - RFC 1945)
     */
    public static final Integer SC_OK_200 = 200;

    /**
     * {@code 401 Unauthorized} (HTTP/1.0 - RFC 1945)
     */
    public static final Integer SC_UNAUTHORIZED_401 = 401;
    /**
     * {@code 500 Server Error} (HTTP/1.0 - RFC 1945)
     */
    public static final Integer SC_INTERNAL_SERVER_ERROR_500 = 500;

    /**
     * 进度
     */
    public static final Integer PROGRESS_INIT = 0;

    /**
     * 进度
     */
    public static final Integer PROGRESS = 100;

    /**
     * 进度map
     */
    public static final HashMap<Long, Integer> PROCESS_MAP = new HashMap<>();


    /**
     * 成功 0
     */
    public static final int NORMAL = 0;

    /**
     * 失败
     */
    public static final int ABNORMAL = 1;

    /**
     * 部分成功响应码
     */
    public static final int CODE_100 = 100;

    /**
     * aws路径标志
     */
    public static final String AWS_FLAG = "s3";

    /**
     * 腾讯路径标志
     */
    public static final String TENCENT_FALG = "myqcloud";



}
