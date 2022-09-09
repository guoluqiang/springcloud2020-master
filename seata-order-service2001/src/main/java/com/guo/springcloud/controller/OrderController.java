package com.guo.springcloud.controller;

import com.guo.springcloud.domian.CommonResult;
import com.guo.springcloud.domian.Order;
import com.guo.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yan
 * @Title: OrderController
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-08上午 11:30
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
