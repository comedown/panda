package com.panda.system.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 性别
     */
    private String gender;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 身份证
     */
    private String identity;

    /**
     * 地址
     */
    private String address;

    /**
     * 星座
     */
    private String constellation;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 用户状态（0：启动，1：禁用）
     */
    private Byte status;

    /**
     * 头像url
     */
    private String profileImageUrl;

    /**
     * 是否有效（默认0：有效，1：无效）
     */
    private Boolean isvalid;

    /**
     * 头像二进制
     */
    private byte[] profileImageBinarry;

    private static final long serialVersionUID = 1L;
}