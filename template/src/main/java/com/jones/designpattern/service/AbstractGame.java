package com.jones.designpattern.service;

public abstract class AbstractGame {
    protected   void initialize(){
        System.out.println("初始化游戏...");
    }

    protected abstract void startPlay();

    protected void endPlay(){
        System.out.println("游戏结束...");
    }


    public void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
