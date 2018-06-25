package com.panda.entity.sys;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "sys_user_auth")
@Getter
@Setter
@ToString
public class UserAuth implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 认证方式
     */
    @Column(name = "auth_type")
    private String authType;

    /**
     * 认证标志
     */
    @Column(name = "auth_flag")
    private String authFlag;

    /**
     * 密码凭证
     */
    private String credential;

    /**
     * 盐
     */
    private String salt;

    private static final long serialVersionUID = 1L;
}