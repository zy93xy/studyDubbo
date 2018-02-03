package com.dubbo.zy.order.provide;

import com.dubbo.zy.order.api.DoOrderRequest;
import com.dubbo.zy.order.api.DoOrderResponse;
import com.dubbo.zy.order.api.OrderService;

/**
 * Created by zhangyang on 2018-02-01.
 */
public class OrderServiceImp implements OrderService{
    public DoOrderResponse getOrder(DoOrderRequest doOrderRequest) {
        DoOrderResponse d = new DoOrderResponse();
        d.setCode(doOrderRequest.getCode());
        d.setMessage(doOrderRequest.getMessage());
        d.setRest_code("请求成功");
        System.out.print("我曾经来过：zy");
        return d;
    }
}
