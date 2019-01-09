package com.zl.study.member.dao;

import com.zl.study.domain.po.MemberUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study.member.dao
 * @ClassName MemberDao
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-15 下午10:58
 * @Version 1.0
 * @Modified By
 */
@Mapper
public interface MemberDao {
    /**
     * 新增会员用户
     *
     * @param memberUser
     * @return
     */
    @Insert("insert into `member_user` (username,password,phone,email) value ()")
    Integer insertUser(MemberUser memberUser);

    /**
     * 根据ID查询会员用户信息
     *
     * @param id
     * @return
     */
    @Select("select id,user_name as userName,phone,email from `member_user` where id=#{id}")
    MemberUser findById(@Param("id") String id);
}
