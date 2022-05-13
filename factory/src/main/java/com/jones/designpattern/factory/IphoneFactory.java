package com.jones.designpattern.factory;

import com.jones.designpattern.bean.impl.Iphone;
import com.jones.designpattern.bean.impl.Mac;
import com.jones.designpattern.bean.PC;
import com.jones.designpattern.bean.Phone;

/**
 * 苹果手机工厂
 */
public class IphoneFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new Iphone();
    }

    @Override
    public PC makePC() {
        return new Mac();
    }
}
