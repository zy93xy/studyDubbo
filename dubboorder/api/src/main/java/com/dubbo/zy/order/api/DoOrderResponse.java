package com.dubbo.zy.order.api;

import java.io.Serializable;

/**
 * Created by zhangyang on 2018-02-01.
 */

public class DoOrderResponse implements Serializable {
    private String code;
    private String message;
    private String rest_code;

    public void setRest_code(String rest_code) {
        this.rest_code = rest_code;
    }

    public String getRest_code() {
        return rest_code;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
