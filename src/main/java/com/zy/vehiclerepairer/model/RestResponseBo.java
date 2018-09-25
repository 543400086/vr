package com.zy.vehiclerepairer.model;

public class RestResponseBo<T> {

    /**
     * 服务器响应数据
     */
    private T data;
    /**
     * 错误信息
     */
    private String msg;

    /**
     * 状态码
     */
    private int code = -1;

    /**
     * 服务器响应时间
     */
    private long timestamp;


    public static RestResponseBo ok() {
        return new RestResponseBo(true);
    }

    public RestResponseBo() {
        this.timestamp = System.currentTimeMillis() / 1000;
    }

    public RestResponseBo(boolean success) {
        this.timestamp = System.currentTimeMillis() / 1000;
    }

    public RestResponseBo(T data) {
        this.timestamp = System.currentTimeMillis() / 1000;
        this.data = data;
    }

    public RestResponseBo(T data, int code) {
        this.timestamp = System.currentTimeMillis() / 1000;
        this.data = data;
        this.code = code;
    }

    public RestResponseBo(String msg) {
        this.timestamp = System.currentTimeMillis() / 1000;
        this.msg = msg;
    }

    public RestResponseBo(String msg, int code) {
        this.timestamp = System.currentTimeMillis() / 1000;
        this.msg = msg;
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
