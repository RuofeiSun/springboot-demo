package com.ruofei.quartz.enums;

/**
 * @Author: srf
 * @Date: 2021/2/25 14:46
 * @description:
 */
public enum  QuartzJobStateEnum{

    STOPPED("0", "停止"),

    RUNNING("1", "运行"),

    DELETED("-1", "删除");


    private String value;
    private String code;

    private QuartzJobStateEnum(String code, String value) {
        this.value = value;
        this.code = code;
    }

    public static QuartzJobStateEnum instance(String code) {
        for (QuartzJobStateEnum e : QuartzJobStateEnum.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 获取value
     */
    public String getValue() {
        return value;
    }

    /**
     * 获取code
     */
    public String getCode() {
        return code;
    }


}
