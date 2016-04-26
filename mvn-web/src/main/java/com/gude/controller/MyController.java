package com.gude.controller;

import com.gude.entity.User;
import com.gude.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author Gude
 * @Date 2016/4/26.
 */
@Controller
public class MyController {
    @Resource
    UserService userService;

    @RequestMapping("/test")
    public String index(){
        return "test";
    }

    @RequestMapping("/find")
    public String find(){
        String name=userService.findUser();
        System.out.println(name);
        return "test";
    }

    @RequestMapping("/add")
    public String add(){
        User user=new User();
        user.setPassword("gude");
        user.setUsername("gude");
        userService.inserUser(user);
        return "test";
    }
}
