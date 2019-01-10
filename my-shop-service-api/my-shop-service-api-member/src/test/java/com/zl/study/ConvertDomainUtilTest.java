package com.zl.study;

import com.zl.study.common.utils.ConvertDomainUtil;
import com.zl.study.api.domain.po.MemberUser;
import org.junit.Test;

import java.util.Map;

/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study
 * @ClassName ConvertDomainUtilTest
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-18 上午8:00
 * @Version 1.0
 * @Modified By
 */
public class ConvertDomainUtilTest {

    @Test
    public void test() {
        MemberUser memberUser = new MemberUser();
        memberUser.setUserName("测试");
        Map map = ConvertDomainUtil.convertObject(MemberUser.class, Map.class, "username");
        System.out.println("map = " + map);
    }
}
