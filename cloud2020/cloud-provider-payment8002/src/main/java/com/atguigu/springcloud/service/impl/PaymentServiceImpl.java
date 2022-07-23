package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Smallming
 * @Description: TODO
 * @DateTime: 2022/4/10 14:48
 **/
@Service("PaymentService")
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment queryById(Long id) {
        return paymentDao.queryById(id);
    }

    @Override
    public Payment insert(Payment payment) {
        paymentDao.insert(payment);
        return payment;
    }
}
