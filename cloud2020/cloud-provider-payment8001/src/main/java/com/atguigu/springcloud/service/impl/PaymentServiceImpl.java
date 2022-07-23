package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Smallming
 * @Description: TODO
 * @DateTime: 2022/4/5 21:32
 **/
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment queryById(Long id) {
        return paymentDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param payment 实例对象
     * @return 实例对象
     */
    @Override
    public Payment insert(Payment payment) {
        paymentDao.insert(payment);
        return payment;
    }
}
