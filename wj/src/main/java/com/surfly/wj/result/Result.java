package com.surfly.wj.result;

import lombok.Data;

@Data
public class Result {
    int code;

    public Result(int code) {
        this.code = code;
    }
}
