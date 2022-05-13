package com.jones.designpattern.bean.impl;

import com.jones.designpattern.bean.PC;

public class MiPC implements PC {
    @Override
    public void make() {
        System.out.println("生产 mi PC");
    }
}
