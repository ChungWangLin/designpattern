package com.jones.designpattern;

import com.jones.designpattern.service.Shape;
import com.jones.designpattern.service.ShapeCache;
import com.jones.designpattern.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        m2();
    }

    public static void m1() throws CloneNotSupportedException, InterruptedException {
        UserService userService = new UserService();
        userService.setName("userService");

        List<String> names = new ArrayList<>();
        names.add("K.O");
        userService.setNames(names);
        System.out.println(userService);
        System.out.println(userService.getName());
        System.out.println(userService.getNames().size());
        System.out.println("=============");

        for (int i = 0; i <5 ; i++) {
            UserService uClone =(UserService) userService.clone();
            uClone.setName("sigma"+i);
            uClone.getNames().add("sigma");
            System.out.println(uClone);
            System.out.println(uClone.getName());
            System.out.println(uClone.getNames().size());
            System.out.println("-----");
        }
        System.out.println("============");

        System.out.println(userService);
        System.out.println(userService.getName());
        System.out.println(userService.getNames().size());
    }

    public static void m2() {
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        System.out.println(shape1.getType());

        Shape shape2 = ShapeCache.getShape("2");
        System.out.println(shape2.getType());

        Shape shape3 = ShapeCache.getShape("3");
        System.out.println(shape3.getType());
    }
}
