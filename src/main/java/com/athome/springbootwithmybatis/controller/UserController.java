package com.athome.springbootwithmybatis.controller;

import com.athome.springbootwithmybatis.common.vo.ResponseVo;
import com.athome.springbootwithmybatis.entity.User;
import com.athome.springbootwithmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Zhaopo
 * @Date: 2021/1/18 14:58
 * @Description:
 */
@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public ResponseVo<User> GetUser(@PathVariable int id){

        return ResponseVo.ok(userService.selectById(id));
    }

    @RequestMapping("updateUser/{id}")
    public String updateUser(@PathVariable int id){
        int result = userService.updateUser(id);
        if(result == 0){
            return "修改失败";
        }
        return "修改成功";
    }
}
