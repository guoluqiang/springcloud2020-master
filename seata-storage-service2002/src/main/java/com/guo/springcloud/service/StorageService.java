package com.guo.springcloud.service;

/**
 * @author yan
 * @Title: StorageService
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-08下午 02:35
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
