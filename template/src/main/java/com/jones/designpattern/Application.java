package com.jones.designpattern;

import com.jones.designpattern.service.impl.Cricket;
import com.jones.designpattern.service.impl.Football;

public class Application {
    public static void main(String[] args) {
        play();
    }

    public static void play() {
        Football football = new Football();
        football.play();
        Cricket cricket = new Cricket();
        cricket.play();
    }
}
