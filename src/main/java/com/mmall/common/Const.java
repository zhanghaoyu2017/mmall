package com.mmall.common;

/**
 * @ClassName Const
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/3/1-18:22
 * @Version 1.0
 **/
public class Const {
    public static final String CURRENT_USER = "currentUser";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    public interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
