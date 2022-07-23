package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Smallming
 * @Description: TODO
 * @DateTime: 2022/4/10 14:49
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

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


}
