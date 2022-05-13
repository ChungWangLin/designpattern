package com.jones.designpattern.service;

public class Square extends Shape{
    public Square() {
        this.type="Square";
    }

    @Override
    void drew() {
        System.out.println("正方形...");
    }
}
