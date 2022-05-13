package com.jones.designpattern.log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class UserServiceLog implements InvocationHandler {
    private final Object target;

    public UserServiceLog(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前...");
        Object res = method.invoke(target, args);
        System.out.println("执行后...");
        return res;
    }
}
