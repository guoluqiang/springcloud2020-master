package com.guo.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yan
 * @Title: ApplicationContextConfig
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-08下午 03:23
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced 使用自己手写的负载均衡，需要去掉LoadBalanced注释
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
