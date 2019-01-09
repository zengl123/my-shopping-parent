package com.zl.study.member.impl;

import com.zl.study.common.base.ResponseBase;
import com.zl.study.common.base.BaseApiService;
import com.zl.study.domain.po.MemberUser;
import com.zl.study.member.dao.MemberDao;
import com.zl.study.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private MemberDao memberDao;

    @Override
    public ResponseBase registered(@RequestBody MemberUser memberUser) {
        Integer result = memberDao.insertUser(memberUser);
        if(result<=0) {
            return error("");
        }
        return success();
    }

    @Override
    public ResponseBase findMemberUserById(String memberUserId) {
        MemberUser memberUser = memberDao.findById(memberUserId);
        if (memberUser == null) {
            return error("会员ID不存在");
        }
        return success(memberUser, "查询成功");
    }
}
