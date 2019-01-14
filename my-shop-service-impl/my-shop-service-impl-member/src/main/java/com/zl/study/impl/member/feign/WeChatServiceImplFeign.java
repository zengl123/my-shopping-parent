package com.zl.study.impl.member.feign;

import com.zl.study.api.wechat.service.IWeChatService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Description:<br>
 * @Project my-shop-parent<br>
 * @Package com.zl.study.impl.member.feign<>br
 * @ClassName MemberFeign<br>
 * @Author 曾灵<br>
 * @QQ|Email 3195690389|17363645521@163.com<br>
 * @Date 2019-01-12 上午2:30<br>
 * @Version 1.0<br>
 * @Modified By <by>
 */
@FeignClient(name = "my-shop-service-impl-wechat")
public interface WeChatServiceImplFeign extends IWeChatService {

}
