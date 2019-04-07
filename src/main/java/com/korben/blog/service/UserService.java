package com.korben.blog.service;

import com.korben.blog.po.User;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author gy
 * @Date 2019-04-04 18:31
 **/

public interface UserService {
    User checkUser(String username, String password);
}
