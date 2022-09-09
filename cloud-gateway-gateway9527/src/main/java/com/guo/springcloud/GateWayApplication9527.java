package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yan
 * @Title: GateWayApplication9527
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-31上午 09:52
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication9527 {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication9527.class,args);
    }
}
