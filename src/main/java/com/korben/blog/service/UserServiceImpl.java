package com.korben.blog.service;

import com.korben.blog.dao.UserRepository;
import com.korben.blog.po.User;
import com.korben.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author gy
 * @Date 2019-04-04 18:34
 **/

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.userRepository = repository;
    }

    @Override
    public User checkUser(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, MD5Utils.code(password));
        return user;
    }


}
