package com.panda.system.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "sys_menu")
@Getter
@Setter
@ToString
public class Menu implements Serializable {
    @Id
    private Integer id;

    /**
     * 菜单编号
     */
    @Column(name = "menu_code")
    private String menuCode;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
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
    @Column(name = "p_id")
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
    @Column(name = "isValid")
    private Boolean isvalid;

    private static final long serialVersionUID = 1L;
}