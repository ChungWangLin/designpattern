package com.jones.designpattern;

import com.jones.designpattern.strategy.impl.OperationAdd;
import com.jones.designpattern.strategy.impl.OperationSub;
import com.jones.designpattern.util.StrategyContext;

public class Application {
    public static void main(String[] args) {
        m1();
    }
    public static void m1() {
        StrategyContext context = new StrategyContext(new OperationAdd());
        System.out.println(context.executeOperation(3, 5));
        StrategyContext context1 = new StrategyContext(new OperationSub());
        System.out.println(context1.executeOperation(5, 8));
    }
}
