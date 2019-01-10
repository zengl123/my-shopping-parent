package com.zl.study.common.utils;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.google.common.base.Optional;
import com.google.common.base.Throwables;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;


/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study.common.utils
 * @ClassName ConvertDomainUtil
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-18 上午7:45
 * @Version 1.0
 * @Modified By
 */
public class ConvertDomainUtil {
    /**
     * list列表类型转换类
     *
     * @param sources     原始数据list列表
     * @param targetClass 转换后的class
     * @param filters     目的类型的实例中的不需要设置的字段名称
     * @return 目的类型实例list列表
     */
    public final static <S, T> List<T> convertList(List<S> sources, final Class<T> targetClass, final String... filters) {
        Optional<List<S>> absentList = Optional.of(sources);
        if (absentList.isPresent()) {
            Collection<T> transformColl = Collections2.transform(absentList.get(), input -> convertObject(input, targetClass, filters));
            return Lists.newArrayList(transformColl);
        }
        return Lists.newArrayList();
    }

    /**
     * 类型转换类
     *
     * @param source  原始类型实例
     * @param target  目的类型
     * @param filters 目的类型的实例中的不需要设置的字段名称
     * @return 目的类型实例
     */
    public final static <S, T> T convertObject(S source, Class<T> target, String... filters) {
        try {
            T t = target.newInstance();
            BeanUtils.copyProperties(Optional.of(source).get(), t, filters);
            return t;
        } catch (Exception e) {
            Throwables.propagateIfPossible(e);
            return null;
        }
    }
}
