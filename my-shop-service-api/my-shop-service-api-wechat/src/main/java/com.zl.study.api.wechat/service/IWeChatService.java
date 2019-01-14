package com.zl.study.api.wechat.service;

import com.zl.study.common.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping(value = "/wechat/")
public interface IWeChatService {
    /**
     * 登陆
     *
     * @return
     */
    @RequestMapping(value = "login")
    ResponseBase login();
}
