package com.zl.study.member.service;

import com.zl.study.common.annotation.SysLog;
import com.zl.study.common.base.ResponseBase;
import com.zl.study.member.domain.po.MemberUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Component;
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
     * 根据ID更新会员用户信息
     *
     * @param memberUser
     * @return
     */
    @ApiOperation(value = "根据ID更新会员用户信息")
    @PostMapping(value = "updateMemberUserById")
    ResponseBase updateMemberUserById(MemberUser memberUser);

    /**
     * 根据ID查询会员用户信息
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "根据ID查询会员用户信息")
    @GetMapping(value = "findMemberUserById/{id}")
    ResponseBase findMemberUserById(@PathVariable(value = "id") String id);

    /**
     * 会员服务调用微信服务
     *
     * @return
     */
    @ApiOperation(value = "会员服务调用微信服务")
    @GetMapping(value = "login")
    ResponseBase login();
}
