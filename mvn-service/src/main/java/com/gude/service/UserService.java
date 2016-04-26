package com.gude.service;

import com.gude.dao.UserMapper;
import com.gude.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Gude
 * @Date 2016/4/26.
 */
@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public String findUser() {
        return "gude";
    }


    public void inserUser(User user){
       userMapper.insertUser(user) ;
    }
}
