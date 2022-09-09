package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yan
 * @Title: OrderConsulApplication80
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-14上午 11:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulApplication80.class,args);
    }
}
