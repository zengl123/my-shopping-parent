package com.zl.study.api.member.service;

import com.zl.study.api.member.domain.po.MemberUser;
import com.zl.study.common.base.ResponseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
@Api(tags = "会员服务接口")
@RequestMapping(value = "/member/")
public interface IMemberService {
    /**
     * 会员注册
     *
     * @param memberUser
     * @return
     */
    @ApiOperation(value = "会员注册")
    @PostMapping(value = "register")
    ResponseBase register(MemberUser memberUser);

    /**
     * 根据ID查询会员用户信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "findMemberUserById/{id}")
    ResponseBase findMemberUserById(@PathVariable("id") String id);

    /**
     * 根据ID更新会员用户信息
     *
     * @param memberUser
     * @return
     */
    @PostMapping(value = "updateMemberUserById")
    ResponseBase updateMemberUserById(MemberUser memberUser);

    /**
     * 会员服务调用微信服务
     * @return
     */
    @GetMapping(value = "login")
    ResponseBase login();
}
