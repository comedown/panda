package com.panda.system.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class UserAuth implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 认证方式
     */
    private String authType;

    /**
     * 认证标志
     */
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