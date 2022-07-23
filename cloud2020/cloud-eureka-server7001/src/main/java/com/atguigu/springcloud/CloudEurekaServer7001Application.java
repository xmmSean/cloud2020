package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Smallming
 * @Description: TODO
 * @DateTime: 2022/4/9 15:52
 **/
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7001Application {
    public static void main(String[] args) {
        /*
        * 启动类
        * 方法
        * */
        SpringApplication.run(CloudEurekaServer7001Application.class,args); 
    }
}
