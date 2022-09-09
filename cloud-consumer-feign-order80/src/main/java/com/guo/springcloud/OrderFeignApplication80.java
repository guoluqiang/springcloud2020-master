package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yan
 * @Title: OrderFeignApplication80
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-29下午 05:35
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApplication80.class,args);
    }
}
