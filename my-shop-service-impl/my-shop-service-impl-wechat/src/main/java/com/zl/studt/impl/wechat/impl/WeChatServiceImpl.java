package com.zl.studt.impl.wechat.impl;

import com.zl.study.api.wechat.service.IWeChatService;
import com.zl.study.common.base.BaseApiService;
import com.zl.study.common.base.ResponseBase;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:<br>
 * @Project my-shop-parent<br>
 * @Package com.zl.studt.impl.wechat.impl<>br
 * @ClassName WeChatServiceImpl<br>
 * @Author 曾灵<br>
 * @QQ|Email 3195690389|17363645521@163.com<br>
 * @Date 2019-01-12 上午2:51<br>
 * @Version 1.0<br>
 * @Modified By <by>
 */
@RestController
public class WeChatServiceImpl extends BaseApiService implements IWeChatService {

    @Override
    public ResponseBase login() {
        return success("登陆成功");
    }
}
