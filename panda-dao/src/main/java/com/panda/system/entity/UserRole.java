package com.panda.system.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "sys_user_role")
@Getter
@Setter
@ToString
public class UserRole implements Serializable {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role_id")
    private Integer roleId;

    private static final long serialVersionUID = 1L;
}