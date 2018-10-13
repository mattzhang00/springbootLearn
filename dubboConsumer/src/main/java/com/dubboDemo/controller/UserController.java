package com.dubboDemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubboDemo.services.UserService;
import com.dubboDemo.services.UserTestConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author: zhangling
 * @Description:
 * @Date: Created in 5:33 PM 12/10/2018
 */
@RestController
public class UserController {
    @Autowired
    UserTestConsumerService userTestConsumerService;

    @RequestMapping("/get")
    public String getUser()
    {
        System.out.println("Try to call the dubbo service");
        //return "hello demo";
        return userTestConsumerService.testDemo();
    }

    @RequestMapping("/")
    public String home() {
     return "this is home";
    }
}
