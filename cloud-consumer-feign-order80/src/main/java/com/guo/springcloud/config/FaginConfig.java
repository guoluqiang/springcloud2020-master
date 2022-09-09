package com.guo.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yan
 * @Title: FaginConfig
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-30上午 11:10
 */
@Configuration
public class FaginConfig {

    @Bean
    Logger.Level feginLoggerLevel(){
        return Logger.Level.FULL;
    }
}
