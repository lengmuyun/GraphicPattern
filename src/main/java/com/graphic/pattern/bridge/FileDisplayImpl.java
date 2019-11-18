package com.graphic.pattern.bridge;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FileDisplayImpl extends DisplayImpl {

    private String filePath;

    public FileDisplayImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        try {
            String content = Files.toString(new File(filePath), UTF_8);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("读取文件内容失败!");
        }

    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i=0; i<30; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

}
