package com.zl.study.domain.po;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zl.study.domain.po.BasePo;
import lombok.Data;

/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study.domain
 * @ClassName MemberUser
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-15 下午11:02
 * @Version 1.0
 * @Modified By
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberUser extends BasePo {
    private String userName;
    private String password;
    private String phone;
    private String email;
}
