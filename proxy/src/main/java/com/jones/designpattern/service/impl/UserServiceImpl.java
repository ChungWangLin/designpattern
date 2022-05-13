package com.jones.designpattern.service.impl;

import com.jones.designpattern.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void say() {
        System.out.println("Hello");
    }
}
