package com.liumapp.simple.a.logic;

import com.liumapp.simple.a.constant.SimpleConstant;
import com.liumapp.simple.a.property.Properties;

/**
 * @author liumapp
 * @file LogicA.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/3/18
 */
public class Logic {

    protected Properties properties;

    public Logic(Properties properties) {
        this.properties = properties;
    }

    public void saySomething () {
        System.out.println("logic a say : get active info " + properties.getString(SimpleConstant.activeInfo));
    }

}
