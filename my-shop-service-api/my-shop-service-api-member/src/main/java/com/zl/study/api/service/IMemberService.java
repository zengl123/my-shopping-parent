package com.zl.study.api.service;

import com.zl.study.common.base.ResponseBase;
import com.zl.study.api.domain.po.MemberUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
     * @param memberUser
     * @return
     */
    @ApiOperation(value = "会员注册")
    @RequestMapping(value = "register",method = RequestMethod.POST)
    ResponseBase register(MemberUser memberUser);

    /**
     * 根据ID查询会员用户信息
     *
     * @param memberUserId
     * @return
     */
    @RequestMapping(value = "findMemberUserById")
    ResponseBase findMemberUserById(String memberUserId);
}
