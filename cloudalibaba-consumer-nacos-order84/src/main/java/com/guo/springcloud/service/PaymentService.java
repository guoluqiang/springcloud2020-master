package com.guo.springcloud.service;

import com.guo.springcloud.common.CommonResult;
import com.guo.springcloud.pojo.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yan
 * @Title: PaymentService
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-07下午 05:15
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
