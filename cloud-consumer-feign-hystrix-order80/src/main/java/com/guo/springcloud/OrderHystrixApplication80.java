package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yan
 * @Title: OrderHystrixApplication80
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-30下午 02:34
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixApplication80 {

    public static void main(String[] args) {

        SpringApplication.run(OrderHystrixApplication80.class,args);
    }
}
