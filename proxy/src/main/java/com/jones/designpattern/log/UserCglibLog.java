package com.jones.designpattern.log;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserCglibLog implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 方法增强前...");
        Object res = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib 方法增强后...");
        return res;
    }
}
