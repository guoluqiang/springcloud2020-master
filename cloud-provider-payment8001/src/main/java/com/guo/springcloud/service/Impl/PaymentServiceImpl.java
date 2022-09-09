package com.guo.springcloud.service.Impl;

import com.guo.springcloud.dao.PaymentDao;
import com.guo.springcloud.pojo.Payment;
import com.guo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yan
 * @Title: PaymentServiceImpl
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-08下午 02:45
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        String a = "aaa";
        log.info(String.valueOf(payment));
        return paymentDao.create(payment);
    }

    public Payment getById(Integer id){
        return paymentDao.getById(id);
    }
}
