package com.example.demo.common.bean;

import com.example.demo.common.consts.Const;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述：统一返回接口
 *
 * @author wan
 * @date 2019/6/5
 * @since 0.0.1
 */
@Data
public class Response<T> implements Serializable {

    /**
     * 返回处理消息
     */
    private String message = "操作成功！";

    /**
     * 返回代码,默认200为成功，其他为失败
     */
    private Integer code = 200;

    /**
     * 返回数据对象 data
     */

    private T data;

    public Response() {

    }

    public static Response<Object> failure(String msg) {
        return failure(Const.SC_INTERNAL_SERVER_ERROR_500, msg);
    }

    public static Response<Object> failure(String message, Object data) {
        Response<Object> r = new Response<Object>();
        r.setCode(Const.SC_INTERNAL_SERVER_ERROR_500);
        r.setData(data);
        r.setMessage(message);
        return r;
    }

    public static Response<Object> failure(int code, String msg) {
        Response<Object> r = new Response<Object>();
        r.setCode(code);
        r.setMessage(msg);
        return r;
    }

    public static Response<Object> failure(int code, String message, Object data) {
        Response<Object> r = new Response<Object>();
        r.setMessage(message);
        r.setCode(code);
        r.setData(data);
        return r;
    }

    public static Response<Object> success() {
        Response<Object> r = new Response<Object>();
        r.setCode(Const.SC_OK_200);
        r.setMessage("成功");
        return r;
    }

    public static Response<Object> success(String msg) {
        Response<Object> r = new Response<Object>();
        r.setCode(Const.SC_OK_200);
        r.setMessage(msg);
        return r;
    }

    public static Response<Object> success(Object data) {
        Response<Object> r = new Response<Object>();
        r.setCode(Const.SC_OK_200);
        r.setData(data);
        return r;
    }

    public static Response<Object> success(String message, Object data) {
        Response<Object> r = new Response<Object>();
        r.setMessage(message);
        r.setCode(Const.SC_OK_200);
        r.setData(data);
        return r;
    }
}
