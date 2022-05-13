package com.jones.designpattern;

import com.jones.designpattern.service.UserService;
import com.jones.designpattern.service.impl.UserServiceImpl;
import com.jones.designpattern.util.ProxyUtil;


public class Application {
    public static void main(String[] args) {
        userSay();
    }

    public static void userSay() {
        UserService userLogProxy = (UserService)ProxyUtil.getUserLogProxy(new UserServiceImpl());
        userLogProxy.say();
    }
}
