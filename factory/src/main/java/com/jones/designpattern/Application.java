package com.jones.designpattern;


import com.jones.designpattern.bean.PC;
import com.jones.designpattern.factory.AbstractFactory;
import com.jones.designpattern.factory.MiFactory;
import com.jones.designpattern.factory.SimplePhoneFactory;
import com.jones.designpattern.bean.Phone;

public class Application {
    public static void main(String[] args) {
        factoryMethod();
    }

    public static void simpleFactory() {
        SimplePhoneFactory phoneFactory = new SimplePhoneFactory();
        Phone mi = phoneFactory.makePhone("Mi");
        mi.make();
    }

    public static void factoryMethod() {
        AbstractFactory mi = new MiFactory();
        Phone phone = mi.makePhone();
        PC pc = mi.makePC();
        pc.make();
        phone.make();
    }
}
