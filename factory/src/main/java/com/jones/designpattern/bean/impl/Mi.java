package com.jones.designpattern.bean.impl;

import com.jones.designpattern.bean.Phone;

public class Mi implements Phone {
    @Override
    public void make() {
        System.out.println("制造小米手机");
    }
}
