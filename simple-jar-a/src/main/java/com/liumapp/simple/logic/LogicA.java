package com.liumapp.simple.logic;

import com.liumapp.simple.constant.SimpleAConstant;
import com.liumapp.simple.property.Properties;

public class LogicA {

    protected Properties properties;

    public LogicA(Properties properties) {
        this.properties = properties;
    }

    public void saySomething () {
        System.out.println("logic a say : get active info " + properties.getString(SimpleAConstant.activeInfo));
    }

}
