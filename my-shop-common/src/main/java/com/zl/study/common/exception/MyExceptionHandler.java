package com.zl.study.common.exception;

import com.zl.study.common.base.BaseApiService;
import com.zl.study.common.base.ResponseBase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 描述:全局异常捕获
 * 项目名:my-shopping-parent
 *
 * @Author:ZENLIN
 * @Created 2019/1/9  16:00.
 */
@Slf4j
@RestControllerAdvice
public class MyExceptionHandler extends BaseApiService {

    @ExceptionHandler(value = Exception.class)
    public ResponseBase exception(Exception e) {
        log.error("aop未知异常:{}", e);
        return error("服务器响应异常");
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseBase exception(RuntimeException e) {
        log.error("aop运行异常:{}", e);
        return error("服务器响应异常");
    }
}
