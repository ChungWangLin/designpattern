package com.jones.designpattern;

import com.jones.designpattern.log.UserCglibLog;
import com.jones.designpattern.service.UserService;
import com.jones.designpattern.service.impl.UserServiceImpl;
import com.jones.designpattern.util.CglibUtil;
import com.jones.designpattern.util.ProxyUtil;


public class Application {
    public static void main(String[] args) {
        userWork();
    }

    public static void userSay() {
        UserService userLogProxy = (UserService)ProxyUtil.getUserLogProxy(new UserServiceImpl());
        userLogProxy.say();
    }

    public static void userWork() {
        UserServiceImpl userLogProxy =(UserServiceImpl) CglibUtil.getProxyObject(UserServiceImpl.class, new UserCglibLog());
        userLogProxy.say();
    }
}
