package com.jones.designpattern.service;

public class Circle extends Shape{
    public Circle() {
        this.type = "Circle";
    }

    @Override
    void drew() {
        System.out.println("圆形...");
    }
}
