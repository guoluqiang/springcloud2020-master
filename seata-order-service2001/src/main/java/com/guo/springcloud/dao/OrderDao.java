package com.guo.springcloud.dao;

import com.guo.springcloud.domian.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yan
 * @Title: OrderDao
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-08上午 11:07
 */
@Mapper
public interface OrderDao {

    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
