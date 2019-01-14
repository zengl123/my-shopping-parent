package com.zl.study.basic.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:网关服务
 * 项目名:my-shop-parent
 *
 * @Author:ZENLIN
 * @Created 2019/1/14  10:09.
 */
@EnableSwagger2
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulServer {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer.class, args);
    }

    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {
        @Override
        public List<SwaggerResource> get() {
            List resource = new ArrayList();
            resource.add(swaggerResource("my-shop-service-impl-member", "/member/v2/api-docs", "1.0"));
            resource.add(swaggerResource("my-shop-service-impl-wechat", "/wechat/v2/api-docs", "1.0"));
            return resource;
        }

        private SwaggerResource swaggerResource(String name, String location, String version) {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }

}
