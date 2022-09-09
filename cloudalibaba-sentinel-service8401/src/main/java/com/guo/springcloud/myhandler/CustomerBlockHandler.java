package com.guo.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.guo.springcloud.common.CommonResult;

/**
 * @author yan
 * @Title: CustomerBlockHandler
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-07下午 03:41
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
