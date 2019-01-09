package com.zl.study.service;

import com.zl.study.common.base.ResponseBase;
import com.zl.study.domain.po.MemberUser;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.SourceVersion;

/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study.service
 * @ClassName IMemberService
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-17 上午8:23
 * @Version 1.0
 * @Modified By
 */
@RequestMapping(value = "/member/")
public interface IMemberService {
    /**
     * 会员注册
     *
     * @param memberUser
     * @return
     */
    ResponseBase registered(@RequestBody MemberUser memberUser);

    /**
     * 根据ID查询会员用户信息
     *
     * @param memberUserId
     * @return
     */
    @RequestMapping(value = "findMemberUserById", method = RequestMethod.GET)
    ResponseBase findMemberUserById(@PathVariable(value = "id") String memberUserId);
}
