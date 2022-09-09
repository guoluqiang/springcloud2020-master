package com.guo.springboot;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IdGeneratorSnowflake{
    private long workerId = 0;
    private long datacenterId = 1;
    private Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);

    public void init(){
        long Id = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
        System.out.println(Id);
    }

    public synchronized long snowflakeId(){
        return snowflake.nextId();
    }

    public synchronized long snowflakeId(long workerId, long datacenterId){
        Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);
        return snowflake.nextId();
    }

    public static void main(String[] args){
        IdGeneratorSnowflake idGenerator = new IdGeneratorSnowflake();
        System.out.println(idGenerator.snowflakeId());

        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 20; i++){
            threadPool.submit(() -> {
                System.out.println(idGenerator.snowflakeId());
            });
        }

        threadPool.shutdown();

    }
}
