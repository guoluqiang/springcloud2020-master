package com.guo.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author yan
 * @Title: LoadBalancer
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-29下午 03:09
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
