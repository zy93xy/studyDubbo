package com.dubbo.zy.order.api;




import java.io.Serializable;
import java.lang.annotation.Annotation;

/**
 * Created by zhangyang on 2018-02-01.
 */
public class DoOrderRequest  implements  Serializable{
    private String code;
    private String message;

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
