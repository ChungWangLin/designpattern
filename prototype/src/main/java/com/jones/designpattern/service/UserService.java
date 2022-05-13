package com.jones.designpattern.service;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserService implements Cloneable{
    private String name;
    private List<String> names;

    public UserService() throws InterruptedException {
        System.out.println("构造开始...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("构造完成！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
