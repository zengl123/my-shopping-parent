package com.zl.study.wechat.service;

import com.zl.study.common.annotation.SysLog;
import com.zl.study.common.base.ResponseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:<br>
 * @Project my-shop-parent<br>
 * @Package com.zl.study.api.wechat.service<>br
 * @ClassName IWeChatServcie<br>
 * @Author 曾灵<br>
 * @QQ|Email 3195690389|17363645521@163.com<br>
 * @Date 2019-01-12 上午2:46<br>
 * @Version 1.0<br>
 * @Modified By <by>
 */
@Api(tags = "微信服务接口")
@RequestMapping(value = "/wechat/")
public interface IWeChatService {
    /**
     * 登录
     *
     * @return
     */
    @ApiOperation(value = "登录")
    @PostMapping(value = "login")
    ResponseBase login();
}
