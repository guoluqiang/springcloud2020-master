package com.guo.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author yan
 * @Title: AccountDao
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-08下午 02:44
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
