package com.jones.designpattern.util;

import com.jones.designpattern.strategy.Operation;

public class StrategyContext {
    Operation operation;

    public StrategyContext(Operation operation) {
        this.operation = operation;
    }

    public int executeOperation(int a, int b) {
        return operation.doOperation(a,b);
    }
}
