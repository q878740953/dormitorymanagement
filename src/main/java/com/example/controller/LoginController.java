package com.example.controller;

import com.example.domain.Users;
import com.example.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private UsersMapper usersMapper;
    @GetMapping("/login")
    public String login(HttpServletRequest request){

        return "login";
    }

    @GetMapping({"/index", "/"})
    public String index(){
        return "index";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "测试";
    }

    @GetMapping("/page/welcome")
    public String welcome(){
        return "page/welcome";
    }
}
