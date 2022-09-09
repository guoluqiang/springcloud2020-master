package com.guo.springcloud.service.impl;

import com.guo.springcloud.dao.StorageDao;
import com.guo.springcloud.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yan
 * @Title: StorageServiceImpl
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-08下午 02:35
 */
@Service
public class StorageServiceImpl  implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}
