package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yan
 * @Title: PaymentApplication9002
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-01下午 02:58
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentApplication9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9002.class, args);
    }
}
