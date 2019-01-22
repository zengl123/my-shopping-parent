package com.zl.study.common.base;

/**
 * 描述:系统日志实体类
 * 项目名:my-spring-integration
 *
 * @Author:ZENLIN
 * @Created 2018/12/14  9:53.
 */

import lombok.Data;
import org.mybatis.generator.api.dom.java.BaseModel;

@Data
public class SysLogBo extends BaseModel {
    /**
     * 描述
     */
    private String remark;
    /**
     * ip地址
     */

    private String ipAddress;
    /**
     * 请求地址
     */
    private String requestUrl;
    /**
     * 请求参数
     */
    private String requestBody;
    /**
     * 响应结果
     */
    private String responseBody;
    /**
     * 请求类
     */
    private String className;
    /**
     * 请求方法
     */

    private String methodName;
    /**
     * 耗时
     */
    private Long executionTime;
}