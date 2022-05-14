package com.jones.designpattern.util;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class CglibUtil {

    public static Object getProxyObject(Class<?> clazz, MethodInterceptor methodInterceptor) {
        Enhancer  enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(methodInterceptor);
        return enhancer.create();
    }
}
