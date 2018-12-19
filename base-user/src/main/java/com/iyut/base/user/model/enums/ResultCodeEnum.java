package com.iyut.base.user.model.enums;

/**
 * @author iyut
 */

public enum ResultCodeEnum {

    SUCC(200, "成功"),
    ERR(5001, "系统异常"),
    FAIL(4001, "失败");

    private int code;
    private String value;

    ResultCodeEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static String getValue(int code) {
        for(ResultCodeEnum resultCodeEnum: ResultCodeEnum.values()) {
            if (code == resultCodeEnum.getCode()) {
                return resultCodeEnum.getValue();
            }
        }
        return "";
    }
}
