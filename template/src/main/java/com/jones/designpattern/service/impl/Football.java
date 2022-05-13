package com.jones.designpattern.service.impl;

import com.jones.designpattern.service.AbstractGame;

public class Football extends AbstractGame {
    @Override
    protected void startPlay() {
        System.out.println("Start Football...");
    }
}
