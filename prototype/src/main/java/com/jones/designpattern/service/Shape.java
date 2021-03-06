package com.jones.designpattern.service;

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void drew();

    @Override
    public Object clone() {
        Object o = null;
        try {
            o=super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
