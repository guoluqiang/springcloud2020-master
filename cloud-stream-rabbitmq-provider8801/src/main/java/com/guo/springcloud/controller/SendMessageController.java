package com.guo.springcloud.controller;

import com.guo.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yan
 * @Title: SendMessageController
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-04-01上午 10:56
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
}
