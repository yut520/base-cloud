package com.iyut.base.user.common;

import com.iyut.base.user.model.enums.ResultCodeEnum;

import java.io.Serializable;

/**
 * @author iyut
 */
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 8228117485236883178L;

    /**
     * 200成功 非200具体错误原因
     */
    private int code;

    /**
     * 具体错误描述or成功描述
     */
    private String message;

    /**
     * 存放业务数据
     */
    private T result;

    public static class Builder {

        @SuppressWarnings("rawtypes")
        public static ResultVO SUCC() {
            ResultVO vo = new ResultVO();
            vo.setCode(ResultCodeEnum.SUCC.getCode());
            vo.setMessage(ResultCodeEnum.SUCC.getValue());
            return vo;
        }

        @SuppressWarnings("rawtypes")
        public static ResultVO FAIL() {
            ResultVO vo = new ResultVO();
            vo.setCode(ResultCodeEnum.FAIL.getCode());
            vo.setMessage(ResultCodeEnum.FAIL.getValue());
            return vo;
        }
    }

    public ResultVO<T> initErrCodeAndMsg(int code, String message) {
        this.code = code;
        this.message = message;
        return this;
    }

    public ResultVO<T> initSuccDataAndMsg(int code, String message) {
        this.code = code;
        this.message = message;
        return this;
    }

    public ResultVO<T> initSuccData(T result) {
        this.result = result;
        return this;
    }

    public ResultVO<T> initMessage(String message) {
        this.message = message;
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
