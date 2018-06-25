package com.panda.entity.sys;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "sys_role_menu")
@Getter
@Setter
@ToString
public class RoleMenu implements Serializable {
    @Id
    private Integer id;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 菜单id
     */
    @Column(name = "menu_id")
    private Integer menuId;

    private static final long serialVersionUID = 1L;
}