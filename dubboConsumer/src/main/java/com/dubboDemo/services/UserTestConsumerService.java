package com.dubboDemo.services;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/***
 * @Author: zhangling
 * @Description:
 * @Date: Created in 6:07 PM 12/10/2018
 */
@Component
public class UserTestConsumerService {

    @Reference
    UserService userService;

    public String testDemo()
    {
        return  userService.getUser();
    }
}
