package com.jones.designpattern.bean.impl;

import com.jones.designpattern.bean.PC;

public class Mac implements PC {
    @Override
    public void make() {
        System.out.println("生产 Mac");
    }
}
