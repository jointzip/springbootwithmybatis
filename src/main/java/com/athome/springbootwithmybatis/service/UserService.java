package com.athome.springbootwithmybatis.service;

import com.athome.springbootwithmybatis.entity.User;
import com.athome.springbootwithmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User selectById(int id){
        return userMapper.selectById(id);
    }

    public User login(String userName, String passWord) {
        return userMapper.login(userName, passWord);
//        // todo: 1. 对象方式
//        User user = new User();
//        user.setUserName(userName);
//        user.setPassWord(passWord);
//        return userMapper.login(user);
    }

    public int register(User user) {
        return userMapper.register(user);
    }

    public int updateUser(int id) {
        return userMapper.updateUser(id);
    }
}
