package com.jones.designpattern.service;

public class UserService2 {
    private UserService2(){}

    private static volatile UserService2 userService2 = null;

    public static UserService2 getInstance(){
        if (userService2 == null) {
            synchronized (UserService2.class) {
                if (userService2 == null) {
                    userService2 = new UserService2();
                }
            }
        }
        return userService2;

    }

    public void say(){
        System.out.println("Hello");
    }
}
