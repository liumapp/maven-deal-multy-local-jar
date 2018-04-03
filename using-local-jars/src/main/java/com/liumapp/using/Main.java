package com.liumapp.using;

import com.liumapp.simple.a.logic.Logic;
import com.liumapp.simple.a.property.Properties;

import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {

        Properties properties = new Properties("config/simple-jar-a.properties");
        Logic logica = new Logic(properties);
        logica.saySomething();

//        com.liumapp.simple.b.property.Properties properties2 = new com.liumapp.simple.b.property.Properties("config/simple-jar-b.properties");
//        com.liumapp.simple.b.logic.Logic logicb = new com.liumapp.simple.b.logic.Logic(properties2);
//        logicb.saySomething();
    }

}
