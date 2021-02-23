package com.athome.springbootwithmybatis.controller;

import com.athome.springbootwithmybatis.entity.User;
import com.athome.springbootwithmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Zhaopo
 * @Date: 2021/1/18 20:11
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class RegisterController {
    @Autowired
    private UserService userService;

    //跳转注册页
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    //注册操作
    @RequestMapping("/register")
    public String register(User user){
        int result = userService.register(user);
        if(result == 0){
            System.out.println("注册失败");
        }
        return "welcome";
    }
}
