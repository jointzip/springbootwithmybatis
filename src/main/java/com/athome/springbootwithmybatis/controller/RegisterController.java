package com.athome.springbootwithmybatis.controller;

import com.athome.springbootwithmybatis.entity.User;
import com.athome.springbootwithmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
    public void toRegister(HttpServletResponse response) throws IOException {
        response.sendRedirect("register.html");
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
