package com.guo.springcloud.domian;

import lombok.Data;

/**
 * @author yan
 * @Title: Storage
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-08下午 02:32
 */
@Data
public class Storage {
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
