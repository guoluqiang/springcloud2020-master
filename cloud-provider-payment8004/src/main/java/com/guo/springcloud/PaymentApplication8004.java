package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yan
 * @Title: PaymentApplication8004
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-11下午 03:12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8004.class,args);
    }
}
