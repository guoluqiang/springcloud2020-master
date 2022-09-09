package com.guo.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author yan
 * @Title: PaymentController
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-14上午 11:32
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul: "+serverPort+"\t" + UUID.randomUUID().toString();
    }
}
