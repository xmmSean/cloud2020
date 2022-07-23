package com.atguigu.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Smallming
 * @Description: TODO
 * @DateTime: 2022/4/5 20:48
 **/
@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class CloudProviderPayment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001Application.class,args);
        log.info("----------------------CloudProviderPayment8001Application runner success---------------------");
    }
}
