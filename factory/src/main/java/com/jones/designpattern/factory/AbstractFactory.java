package com.jones.designpattern.factory;

import com.jones.designpattern.bean.PC;
import com.jones.designpattern.bean.Phone;

/**
 * 抽象工厂,首先就要定义好工厂的功能。
 * 其他产品只需要实现这个抽象工厂就可以了
 */
public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}
