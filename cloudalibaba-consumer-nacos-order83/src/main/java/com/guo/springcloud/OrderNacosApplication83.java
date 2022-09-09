package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yan
 * @Title: OrderNacosApplication83
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-01下午 03:02
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosApplication83 {
    public static void main(String[] args){
        SpringApplication.run(OrderNacosApplication83.class,args);
    }
}