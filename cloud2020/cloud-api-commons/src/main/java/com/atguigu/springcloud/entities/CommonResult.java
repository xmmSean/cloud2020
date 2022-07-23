package com.atguigu.springcloud.entities;

import lombok.Data;

/**
 * @Author: Smallming
 * @Description: TODO
 * @DateTime: 2022/4/5 21:20
 **/
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
