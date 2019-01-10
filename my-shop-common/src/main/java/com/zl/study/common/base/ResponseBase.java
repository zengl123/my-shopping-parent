package com.zl.study.common.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study.common
 * @ClassName ResponseBase
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-14 下午1:54
 * @Version 1.0
 * @Modified By
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBase {
    @ApiModelProperty(value = "响应状态码", name = "code")
    private int code;
    @ApiModelProperty(value = "响应状态", name = "status")
    private boolean status;
    @ApiModelProperty(value = "响应消息", name = "message")
    private String message;
    @ApiModelProperty(value = "响应结果", name = "data")
    private Object data;
}
