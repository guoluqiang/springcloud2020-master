package com.guo.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yan
 * @Title: MyBatisConfig
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-08上午 11:31
 */
@Configuration
@MapperScan({"com.guo.springcloud.dao"})
public class MyBatisConfig {
}
