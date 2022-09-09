package com.guo.springcloud.service;

import com.guo.springcloud.common.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yan
 * @Title: PaymentFeignService
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-29下午 05:38
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Integer id);

    @GetMapping("/payment/fegin/timeout")
    String paymentFeginTimeot();
}
