package com.xr.demo2.utils;

public enum ResultCode {
    ERROR(-100, "error"),
    SUCCESS(200, "ok");

    private int code;
    private String msg;


    ResultCode(int i, String msg) {
        this.code = i;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
