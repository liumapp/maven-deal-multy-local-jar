package com.liumapp.simple.a.property;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.Iterator;
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

    public Properties(String path) throws IOException {
        this(new Content(path).getContent() , "UTF-8");
    }

    public Properties(String content , String readEncoding) throws IOException {
        this.content = content;

        InputStream inputStream = null;
        Reader reader = null;
        try {
            inputStream = IOUtils.toInputStream(content, readEncoding);
            reader = new InputStreamReader(inputStream, readEncoding);

            java.util.Properties properties = new java.util.Properties();
            properties.load(reader);
            for (Iterator<Object> iterator = properties.keySet().iterator(); iterator.hasNext();) {
                String key = iterator.next().toString();
                String value = properties.getProperty(key);
                put(key, value);
            }
        } finally {
            if (reader != null) {
                IOUtils.closeQuietly(reader);
            }

            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
            }
        }
    }

    public void put(String key, String value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null for key [" + key + "]");
        }

        dataMap.put(key, value);
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
