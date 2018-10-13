package com.dubboDemo.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubboDemo.services.UserService;

/***
 * @Author: zhangling
 * @Description:
 * @Date: Created in 5:02 PM 12/10/2018
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "This is dubbo Demo test user";
    }
}
