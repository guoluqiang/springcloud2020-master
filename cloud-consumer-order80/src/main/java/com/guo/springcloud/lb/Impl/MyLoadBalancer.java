package com.guo.springcloud.lb.Impl;

import com.guo.springcloud.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yan
 * @Title: MyLoadBalancer
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-29下午 03:11
 */
@Component
public class MyLoadBalancer implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current > 2147483647 ? 0 : current + 1;
        } while (this.atomicInteger.compareAndSet(current,next));
        System.out.println("*****第几次访问，次数next:"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
