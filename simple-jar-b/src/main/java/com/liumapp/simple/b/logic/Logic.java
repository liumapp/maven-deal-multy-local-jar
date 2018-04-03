package com.liumapp.simple.b.logic;

import com.liumapp.simple.b.constant.SimpleConstant;
import com.liumapp.simple.b.property.Properties;

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
        System.out.println("logic b say : get active info " + properties.getString(SimpleConstant.activeInfo));
    }

}
