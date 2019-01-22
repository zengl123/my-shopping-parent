package com.zl.study.member.domain.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.mybatis.generator.api.dom.java.BaseModel;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zengling
 * @description
 * @date 2019/01/11 15:14
 */
@Data
@ApiModel(value = "MemberUser", description = "会员实体类")
public class MemberUser extends BaseModel {
    @ApiModelProperty(value = "用户名", name = "userName", example = "admin", required = true)
    private String userName;
    @ApiModelProperty(value = "密码", name = "password", example = "admin", required = true)
    private String password;
    @ApiModelProperty(value = "手机号码", name = "phone", example = "10086", required = true)
    private String phone;
    @ApiModelProperty(value = "电子邮箱", name = "email", example = "test@163.com", required = true)
    private String email;
}