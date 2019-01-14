package com.zl.study.common.exception;

/**
 * 描述:
 * 项目名:my-shop-parent
 *
 * @Author:ZENLIN
 * @Created 2019/1/14  11:08.
 */
public class ExceptionUtil extends RuntimeException {

    public ExceptionUtil(Throwable cause) {
        super(cause);
    }

    public ExceptionUtil(String message) {
        super(message);
    }

    public ExceptionUtil(String message, Throwable cause) {
        super(message, cause);
    }
}
