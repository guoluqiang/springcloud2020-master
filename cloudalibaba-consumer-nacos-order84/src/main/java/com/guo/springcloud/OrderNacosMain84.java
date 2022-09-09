package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yan
 * @Title: OrderNacosMain84
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-07下午 04:42
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients//<------------------------启动feign的注解配置
public class OrderNacosMain84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class, args);
    }
}
