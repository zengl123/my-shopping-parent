package com.zl.study.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study.member
 * @ClassName MemberServer
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-13 上午9:17
 * @Version 1.0
 * @Modified By
 */
@SpringBootApplication
@EnableEurekaClient
public class MemberServer {
    public static void main(String[] args) {
        SpringApplication.run(MemberServer.class, args);
    }
}
