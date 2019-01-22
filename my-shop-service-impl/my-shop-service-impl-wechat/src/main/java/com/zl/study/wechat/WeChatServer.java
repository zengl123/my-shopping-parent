package com.zl.study.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:<br>
 * @Project my-shop-parent<br>
 * @Package com.zl.study.impl.wechat<>br
 * @ClassName WeChatServer<br>
 * @Author 曾灵<br>
 * @QQ|Email 3195690389|17363645521@163.com<br>
 * @Date 2019-01-12 上午1:34<br>
 * @Version 1.0<br>
 * @Modified By <by>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class WeChatServer {
    public static void main(String[] args) {
        SpringApplication.run(WeChatServer.class, args);
    }
}
