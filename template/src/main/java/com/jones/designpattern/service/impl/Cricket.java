package com.jones.designpattern.service.impl;

import com.jones.designpattern.service.AbstractGame;

public class Cricket  extends AbstractGame {

    @Override
    protected void initialize() {
        System.out.println("重写 Cricket 初始化规则");
    }

    @Override
    public void startPlay() {
        System.out.println("Start Cricket...");
    }

}
