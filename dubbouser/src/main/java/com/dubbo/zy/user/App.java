package com.dubbo.zy.user;

import com.alibaba.dubbo.common.json.JSON;
import com.dubbo.zy.order.api.DoOrderRequest;
import com.dubbo.zy.order.api.DoOrderResponse;
import com.dubbo.zy.order.api.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring/order-consumer.xml");
        OrderService orderService = (OrderService) classPathXmlApplicationContext.getBean("orderServices");
        DoOrderRequest Order = new DoOrderRequest();
        Order.setCode("1000");
        Order.setMessage("请求入参");

        DoOrderResponse doOrderResponse =  orderService.getOrder(Order);
        System.out.println("doOrderResponse的code=== "+JSON.json(doOrderResponse));
        System.out.println( "doOrderResponse的code=== " +doOrderResponse.getCode()+"---doOrderResponse的message==="+doOrderResponse.getMessage());
    }
}
