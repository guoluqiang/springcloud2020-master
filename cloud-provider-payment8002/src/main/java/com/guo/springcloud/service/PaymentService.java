package com.guo.springcloud.service;

import com.guo.springcloud.pojo.Payment;

/**
 * @author yan
 * @Title: PaymentService
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-09上午 11:13
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getById(Integer id);
}
