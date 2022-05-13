package com.jones.designpattern.strategy.impl;

import com.jones.designpattern.strategy.Operation;

public class OperationAdd implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a+b;
    }
}
