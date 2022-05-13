package com.jones.designpattern.service;

public class Rectangle extends Shape{

    public Rectangle() {
        this.type="Rectangle";
    }

    @Override
    void drew() {
        System.out.println("长方形...");
    }
}
