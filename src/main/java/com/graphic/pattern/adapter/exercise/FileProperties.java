package com.graphic.pattern.adapter.exercise;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用继承方式适配FileIO,也可以使用委托方式
 */
public class FileProperties extends Properties implements FileIO {

    private String packagePath = "D://Resource";

    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileReader(new File(packagePath + "/" + filename)));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileWriter(packagePath + "/" + filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
