package com.zl.study.domain.po;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study.domain
 * @ClassName BasePo
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-15 下午11:07
 * @Version 1.0
 * @Modified By
 */
@Data
public class BasePo implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "主键")
    private String id;
    @ApiModelProperty(value = "创建者", hidden = true)
    private String creator;
    @ApiModelProperty(value = "修改者", hidden = true)
    private String modifier;
    @ApiModelProperty(value = "创建时间", hidden = true)
    private String createTime;
    @ApiModelProperty(value = "修改时间", hidden = true)
    private String modifiedTime;
    @ApiModelProperty(value = "是否删除", hidden = true)
    private String isDeleted;
}
