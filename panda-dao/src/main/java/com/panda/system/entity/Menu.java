package com.panda.system.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Menu implements Serializable {
    private Integer id;

    /**
     * 菜单编号
     */
    private String menuCode;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 描述
     */
    private String description;

    /**
     * 连接
     */
    private String link;

    /**
     * 上级
     */
    private Integer pId;

    /**
     * 图标
     */
    private String icon;

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