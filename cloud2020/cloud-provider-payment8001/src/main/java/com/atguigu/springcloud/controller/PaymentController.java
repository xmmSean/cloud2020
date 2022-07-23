package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Smallming
 * @Description: TODO
 * @DateTime: 2022/4/5 21:35
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/get/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id){

        Payment payment = paymentService.queryById(id);
        return new CommonResult<Payment>(200,"select success,port："+serverPort,payment);

    }

    @PostMapping("/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        Payment insert = paymentService.insert(payment);
        System.out.println(insert);
        System.out.println("1234567890");
        return new CommonResult<>(200, "insert success，", insert);
    }

    @GetMapping("/discover")
    public Object discoveryClient(){

        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("*******service:"+service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(instance -> {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        });

        return discoveryClient;

    }


}
