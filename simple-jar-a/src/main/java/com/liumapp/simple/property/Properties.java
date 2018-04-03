package com.liumapp.simple.property;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author liumapp
 * @file Properties.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/3/18
 */
public class Properties implements Serializable {

    private static final long serialVersionUID = 1723327234615067236L;

    private final Map<String, String> dataMap = new LinkedHashMap<String, String>();

    private String content;

    public Properties() {

    }

    public String getString(String key) {
        if (!dataMap.containsKey(key)) {
            throw new IllegalArgumentException("Key [" + key + "] isn't found in properties");
        }

        return dataMap.get(key);
    }

    public Map<String, String> getDataMap() {
        return dataMap;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "dataMap=" + dataMap +
                '}';
    }
}
