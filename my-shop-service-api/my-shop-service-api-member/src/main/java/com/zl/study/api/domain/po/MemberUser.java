package com.zl.study.api.domain.po;

import lombok.Data;
import org.mybatis.generator.api.dom.java.BaseModel;

/**
 * @description 
 * @author zengling
 * @date 2019/01/11 15:14
 */
@Data
public class MemberUser extends BaseModel {
    private static final long serialVersionUID = 5737248658739043857L;
    private String userName;
    private String password;
    private String phone;
    private String email;
}