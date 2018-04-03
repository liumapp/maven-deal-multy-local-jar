package com.liumapp.simple.a.logic;

import com.liumapp.simple.a.constant.SimpleAConstant;
import com.liumapp.simple.a.property.Properties;

public class LogicA {

    protected Properties properties;

    public LogicA(Properties properties) {
        this.properties = properties;
    }

    public void saySomething () {
        System.out.println("logic a say : get active info " + properties.getString(SimpleAConstant.activeInfo));
    }

}
