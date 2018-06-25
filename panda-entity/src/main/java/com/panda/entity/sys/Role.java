package com.panda.entity.sys;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "sys_role")
@Getter
@Setter
@ToString
public class Role implements Serializable {
    /**
     * 主键，自增
     */
    @Id
    private Integer id;

    /**
     * 角色编号
     */
    @Column(name = "role_code")
    private String roleCode;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 组织机构id
     */
    @Column(name = "tenant_id")
    private String tenantId;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 是否有效（默认0：有效，1：无效）
     */
    @Column(name = "isValid")
    private Boolean isvalid;

    private static final long serialVersionUID = 1L;
}