package com.guo.springcloud.controller;

import com.guo.springcloud.common.CommonResult;
import com.guo.springcloud.pojo.Payment;
import com.guo.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yan
 * @Title: OrderFeignController
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-29下午 05:44
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/fegin/timeout")
    public String paymentFeginTimeot(){
        return paymentFeignService.paymentFeginTimeot();
    }
}
