package com.zl.study.basic.zuul.configutation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 项目名:my-shop-parent
 *
 * @Author:ZENLIN
 * @Created 2019/1/15  9:50.
 */
@Component
@Primary
@ComponentScan(basePackages = "com.zl.study")
@EnableSwagger2
class DocumentationConfig implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List resource = new ArrayList();
        resource.add(swaggerResource("api-member", "/my-shop-service-impl-member/v2/api-docs", "1.0"));
        resource.add(swaggerResource("api-wechat", "/my-shop-service-impl-wechat/v2/api-docs", "1.0"));
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

