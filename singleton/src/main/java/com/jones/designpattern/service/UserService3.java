package com.jones.designpattern.service;

public enum UserService3 {
    INSTANCE;
    public void say() {
        System.out.println("Hello");
    }

    public int add(int a,int b) {
        return a+b;
    }
}
