package com.test.dubbo.controller;

import com.test.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public Object hello(){

       userService.buyNewMovie();

        return "OK";
    }
}
