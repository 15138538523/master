package com.qfedu.common;

/**
 * projectName: bankDoum
 * author: 崔
 * time: 2020/9/3 0003 21:35
 * description:json类
 */

public class JsonResult {
    private int code;
    //info是真正返回前端的数据
    private Object info;

    public JsonResult(){}

    public JsonResult(int code, Object info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}
