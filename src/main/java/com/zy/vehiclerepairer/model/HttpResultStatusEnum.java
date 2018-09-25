package com.zy.vehiclerepairer.model;

public enum HttpResultStatusEnum {
    OK(200, "成功"),

    FAIL(500, "失败"),


    UNKNOWN(-1, "未知类型");

    private int value;

    private String desc;

    HttpResultStatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static HttpResultStatusEnum valueOf(int value) {
        for (HttpResultStatusEnum httpResultStatusEnum : values()) {
            if (httpResultStatusEnum.getValue() == value) {
                return httpResultStatusEnum;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
