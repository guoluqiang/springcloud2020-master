package com.guo.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author yan
 * @Title: PaymentFallbackService
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-30下午 03:31
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
