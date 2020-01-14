package com.graphic.pattern.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Database {

    private Database() {
    }

    /**
     * 根据数据库名获取Properties
     * hyuki@hyuki.com=Hiroshi Yuki
     * hanako@hyuki.com=Hanako Sato
     * tomura@hyuki.com=Tomura
     * mamoru@hyuki.com=Mamoru Takahashi
     * @return
     */
    public static Properties getMemoryProperties() {
        Properties prop = new Properties();
        prop.setProperty("hyuki@hyuki.com", "Hiroshi Yuki");
        prop.setProperty("hanako@hyuki.com", "Hanako Sato");
        prop.setProperty("tomura@hyuki.com", "Tomura");
        prop.setProperty("mamoru@hyuki.com", "Mamoru Takahashi");
        return prop;
    }

    public static Properties getProperties(String dbname) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(dbname));
        } catch (IOException e) {
            System.out.println("Warning: " + dbname + " is not found.");
        }
        return prop;
    }

}
