package com.cn.tsf.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: 葛鹏飞
 * @Date: 2019/11/12 16:03
 * @Version 1.0
 * 类信息:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TsfConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(TsfConsumerApp.class,args);
    }
}
