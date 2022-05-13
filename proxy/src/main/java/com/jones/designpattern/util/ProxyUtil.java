package com.jones.designpattern.util;

import com.jones.designpattern.log.UserServiceLog;

import java.lang.reflect.Proxy;

public class ProxyUtil {
    private static final ClassLoader classLoader = ProxyUtil.class.getClassLoader();
    public static Object getUserLogProxy(Object o) {
        Class<?>[] classes = o.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader,classes, new UserServiceLog(o));
    }
}
