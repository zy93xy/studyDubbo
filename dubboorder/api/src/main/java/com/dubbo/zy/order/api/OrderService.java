package com.dubbo.zy.order.api;

/**
 * Created by zhangyang on 2018-02-01.
 */
public interface OrderService {
    public DoOrderResponse  getOrder(DoOrderRequest doOrderRequest);
}
