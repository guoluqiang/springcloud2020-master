package com.guo.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yan
 * @Title: Payment
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-08下午 02:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Integer id;
    private String serial;
}
