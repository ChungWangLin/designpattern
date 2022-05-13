package com.jones.designpattern;

import com.jones.designpattern.service.UserService;
import com.jones.designpattern.service.UserService2;
import com.jones.designpattern.service.UserService3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            threadPool.execute(Application::m3);
        }
    }

    public static void m1() {
        UserService u = UserService.getInstance();
        System.out.println(u);
        u.say();
    }

    public static void m2() {
        UserService2 u = UserService2.getInstance();
        System.out.println(u);
        u.say();
    }

    public static void m3() {
        UserService3 userService3 = UserService3.INSTANCE;
        System.out.println(userService3);
        System.out.println(userService3.add(1, 4));
    }
}
