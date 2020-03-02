package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * @InterfaceName IUserService
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/3/1-16:06
 * @Version 1.0
 **/
public interface IUserService {
    ServerResponse<User> login(String username, String password);
    ServerResponse<String> register(User user);
    ServerResponse<String> checkValid(String str, String type);
}
