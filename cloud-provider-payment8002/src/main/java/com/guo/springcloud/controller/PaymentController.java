package com.guo.springcloud.controller;

import com.guo.springcloud.common.CommonResult;
import com.guo.springcloud.pojo.Payment;
import com.guo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yan
 * @Title: PaymentController
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-09上午 11:09
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果——>"+result);
        if(result > 0){
            return new CommonResult(200,"成功,serverPort:"+serverPort,result);
        } else{
            return new CommonResult(400,"失败,serverPort:"+serverPort,null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id) {
        Payment payment = paymentService.getById(id);
        log.info("查询结果——>"+payment);
        if(!StringUtils.isEmpty(payment)){
            return new CommonResult(200,"成功,serverPort:"+serverPort,payment);
        } else{
            return new CommonResult(400,"失败,serverPort:"+serverPort,null);
        }
    }

    @GetMapping("/discover")
    public Object discoveryClient(){

        List<String> services = discoveryClient.getServices();
        services.stream().forEach(str ->{
            log.info("服务名称---->"+str);
        });
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.stream().forEach(obj ->{
            log.info(obj.getInstanceId()+"\t"+obj.getHost()+"\t"+obj.getPort()+"\t"+obj.getUri());
        });
        return this.discoveryClient;
    }

    @GetMapping("/lb")
    public String getPayMentLB(){
        return serverPort;
    }
}
