package com.jones.designpattern.service;


/**
 * 饿汉式
 */
public class UserService {
    private UserService(){}

    private static final UserService userService = new UserService();

    public static UserService getInstance(){
        return userService;
    }

    public void say() {
        System.out.println("hello");
    }

}
