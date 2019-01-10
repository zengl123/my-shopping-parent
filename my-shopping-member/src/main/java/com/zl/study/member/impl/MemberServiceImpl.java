package com.zl.study.member.impl;

import com.zl.study.common.base.BaseApiService;
import com.zl.study.common.base.ResponseBase;
import com.zl.study.common.security.Md5Util;
import com.zl.study.domain.po.MemberUser;
import com.zl.study.member.dao.MemberUserMapper;
import com.zl.study.service.IMemberService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study.member.impl
 * @ClassName MemberServiceImpl
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-17 下午9:19
 * @Version 1.0
 * @Modified By
 */
@RestController
public class MemberServiceImpl extends BaseApiService implements IMemberService {
    @Autowired
    private MemberUserMapper memberUserMapper;

    @Override
    public ResponseBase registered(MemberUser memberUser) {
        String password = memberUser.getPassword();
        if (StringUtils.isEmpty(password)) {
            return error("密码不能为空");
        }
        String newPassword = Md5Util.Md5EncodeUtf8Salt(password);
        memberUser.setPassword(newPassword);
        Integer result = memberUserMapper.insert(memberUser);
        if (result <= 0) {
            return error("注册失败");
        }
        return success("注册成功");
    }

    @Override
    public ResponseBase findMemberUserById(String memberUserId) {
        if (StringUtils.isEmpty(memberUserId)) {
            return error("会员ID不能为空");
        }
        MemberUser memberUser = memberUserMapper.findById(memberUserId);
        if (memberUser == null) {
            return error("会员ID不存在");
        }
        return success(memberUser, "查询成功");
    }
}
