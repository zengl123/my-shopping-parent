package com.zl.study.member.dao;


import com.zl.study.api.domain.po.MemberUser;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.generator.api.dom.java.BaseMapper;

/**
 * @author zengling
 * @description
 * @date 2019/01/10 18:22
 */
@Mapper
public interface MemberUserMapper extends BaseMapper<MemberUser> {

}