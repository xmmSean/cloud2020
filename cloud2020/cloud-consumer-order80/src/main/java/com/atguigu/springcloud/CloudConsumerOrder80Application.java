package com.atguigu.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Smallming
 * @Description: TODO
 * @DateTime: 2022/4/8 23:19
 **/
@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class CloudConsumerOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80Application.class,args);
        log.info("----------------------CloudProviderPayment8001Application runner success---------------------");
    }
}
