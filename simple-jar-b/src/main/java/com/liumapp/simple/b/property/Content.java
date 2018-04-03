package com.liumapp.simple.b.property;

import com.liumapp.simple.b.util.IOUtil;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Content {

    private String content;

    public Content(String path) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = IOUtil.getInputStream(path);
            this.content = IOUtils.toString(inputStream, "UTF-8");
        } finally {
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
            }
        }
    }

    public Content(File file) throws IOException {
        this.content = FileUtils.readFileToString(file, "UTF-8");
    }

    public Content(StringBuilder stringBuilder) throws IOException {
        this.content = stringBuilder.toString();
    }

    public String getContent() {
        return content;
    }

}
