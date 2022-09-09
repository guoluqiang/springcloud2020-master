package com.guo.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yan
 * @Title: StorageDao
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-08下午 02:32
 */
@Mapper
public interface StorageDao {
    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
