package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yan
 * @Title: NacosConfigClientApplication3377
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-01下午 03:23
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientApplication3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApplication3377.class, args);
    }
}
