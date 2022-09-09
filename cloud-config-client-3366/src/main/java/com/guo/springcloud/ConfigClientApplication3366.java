package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yan
 * @Title: ConfigClientApplication3366
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-01上午 10:07
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication3366 {

    public static void main(String[] args){

        SpringApplication.run(ConfigClientApplication3366.class,args);
    }
}
