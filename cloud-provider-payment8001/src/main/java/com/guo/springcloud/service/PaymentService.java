package com.guo.springcloud.service;

import com.guo.springcloud.pojo.Payment;

/**
 * @author yan
 * @Title: PaymentService
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-08下午 02:45
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getById(Integer id);
}
