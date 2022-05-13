package com.jones.designpattern.factory;

import com.jones.designpattern.bean.impl.Mi;
import com.jones.designpattern.bean.impl.MiPC;
import com.jones.designpattern.bean.PC;
import com.jones.designpattern.bean.Phone;

/**
 * 小米手机工厂
 */
public class MiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new Mi();
    }

    @Override
    public PC makePC() {
        return new MiPC();
    }
}
