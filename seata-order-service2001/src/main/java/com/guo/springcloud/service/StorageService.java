package com.guo.springcloud.service;

import com.guo.springcloud.domian.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yan
 * @Title: StorageService
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-08上午 11:12
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
