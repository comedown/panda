package com.panda.system.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Role implements Serializable {
    /**
     * 主键，自增
     */
    private Integer id;

    /**
     * 角色编号
     */
    private String roleCode;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 组织机构id
     */
    private String tenantId;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 是否有效（默认0：有效，1：无效）
     */
    private Boolean isvalid;

    private static final long serialVersionUID = 1L;
}