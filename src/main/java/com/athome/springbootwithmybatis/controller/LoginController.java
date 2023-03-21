package com.athome.springbootwithmybatis.controller;

import com.athome.springbootwithmybatis.entity.User;
import com.athome.springbootwithmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:Zhaopo
 * @Date: 2021/1/18 19:43
 * @Description: 登录功能
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userService;

    //跳转首页（登录页）
    @RequestMapping("/toIndex")
    public String show(){
        return "index";
    }

    //登录操作
    @ResponseBody
    @PostMapping("/loginUser")
    public String login(@RequestBody User user, HttpServletRequest request){
        String userName = user.getUserName();
        String passWord = user.getPassWord();
        User currentUser =  userService.login(userName, passWord);
        if(currentUser == null){
            return "用户名或者密码错误";
        } else {
            request.getSession().setAttribute("session_user", user);//登录成功后将用户放入session中，用于拦截
            return "登录成功";
        }

    }

    //测试未登陆拦截页面
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    //退出登录
    @RequestMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response){
        request.getSession().removeAttribute("session_user");
        try {
            response.sendRedirect("/user/toIndex");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
