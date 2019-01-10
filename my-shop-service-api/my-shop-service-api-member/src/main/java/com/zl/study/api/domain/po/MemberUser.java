package com.zl.study.api.domain.po;

import lombok.Data;

/**
 * @description 
 * @author zengling
 * @date 2019/01/10 18:22
 */
@Data
public class MemberUser extends BasePo {
    private static final long serialVersionUID = 6069664985216709510L;
    private String userName;
    private String password;
    private String phone;
    private String email;
}