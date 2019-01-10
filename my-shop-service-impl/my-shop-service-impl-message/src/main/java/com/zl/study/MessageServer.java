package com.zl.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study
 * @ClassName MessageServer
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-18 下午8:56
 * @Version 1.0
 * @Modified By
 */
@SpringBootApplication
@EnableEurekaClient
public class MessageServer {
    public static void main(String[] args) {
        SpringApplication.run(MessageServer.class, args);
    }
}
