package com.zl.study.impl.member.impl;

import com.zl.study.api.member.domain.po.MemberUser;
import com.zl.study.api.member.service.IMemberService;
import com.zl.study.api.wechat.service.IWeChatService;
import com.zl.study.common.base.BaseApiService;
import com.zl.study.common.base.ResponseBase;
import com.zl.study.common.security.Md5Util;
import com.zl.study.impl.member.dao.MemberUserMapper;
import com.zl.study.impl.member.feign.WeChatServiceImplFeign;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    @Autowired
    private WeChatServiceImplFeign weChatServiceImplFeign;


    @Override
    public ResponseBase register(@RequestBody MemberUser memberUser) {
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
    public ResponseBase findMemberUserById(@PathVariable("id") String memberUserId) {
        if (StringUtils.isEmpty(memberUserId)) {
            return error("会员ID不能为空");
        }
        MemberUser memberUser = memberUserMapper.findById(memberUserId);
        if (memberUser == null) {
            return error("会员ID不存在");
        }
        return success(memberUser, "查询成功");
    }

    /**
     * 根据ID更新会员用户信息
     *
     * @param memberUser
     * @return
     */
    @Override
    public ResponseBase updateMemberUserById(@RequestBody MemberUser memberUser) {
        int result = memberUserMapper.update(memberUser);
        if (result <= 0) {
            return error("会员信息编辑失败");
        }
        return success("会员信息编辑成功");
    }

    @Override
    public ResponseBase login() {
        return weChatServiceImplFeign.login();
    }
}
