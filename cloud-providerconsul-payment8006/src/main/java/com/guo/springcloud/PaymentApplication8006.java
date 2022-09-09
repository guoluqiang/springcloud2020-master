package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yan
 * @Title: PaymentApplication8006
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-14上午 11:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8006.class,args);
    }
}
