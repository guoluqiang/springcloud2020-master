package com.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yan
 * @Title: SeataOrderMainApp20002
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-08下午 02:31
 */
@EnableDiscoveryClient
@EnableFeignClients
//取消数据源的自动创建，而是使用自己定义的
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SeataOrderMainApp2002 {
    public static void main(String[] args){
        SpringApplication.run(SeataOrderMainApp2002.class, args);
    }
}
