package com.jones.designpattern.factory;

import com.jones.designpattern.bean.impl.Iphone;
import com.jones.designpattern.bean.impl.Mi;
import com.jones.designpattern.bean.Phone;


/**
 * 简单工厂，增加新类型时要修改工厂代码，不符合开闭原则。
 */
public class SimplePhoneFactory {
    public Phone makePhone(String phone) {
        if ("Mi".equals(phone)) {
            return new Mi();
        } else if("Iphone".equals(phone)) {
            return new Iphone();
        } else {
            throw new RuntimeException("没有该类型手机！");
        }
    }
}
