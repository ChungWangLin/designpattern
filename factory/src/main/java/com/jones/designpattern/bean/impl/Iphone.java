package com.jones.designpattern.bean.impl;

import com.jones.designpattern.bean.Phone;

public class Iphone implements Phone {
    @Override
    public void make() {
        System.out.println("苹果手机");
    }
}
