package com.guo.springcloud.service;

import com.guo.springcloud.common.CommonResult;
import com.guo.springcloud.pojo.Payment;
import org.springframework.stereotype.Component;

/**
 * @author yan
 * @Title: PaymentFallbackService
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-07下午 05:17
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(Math.toIntExact(id),"errorSerial"));
    }
}
