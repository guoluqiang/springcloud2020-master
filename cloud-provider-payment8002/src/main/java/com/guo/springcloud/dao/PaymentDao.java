package com.guo.springcloud.dao;

import com.guo.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yan
 * @Title: PaymentDao
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-09上午 11:14
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getById(@Param("id") Integer id);
}
