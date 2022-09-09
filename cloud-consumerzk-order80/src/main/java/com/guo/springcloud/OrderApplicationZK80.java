package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yan
 * @Title: OrderApplicationZK80
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-11下午 03:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplicationZK80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationZK80.class,args);
    }
}
