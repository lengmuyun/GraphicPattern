package com.graphic.pattern.adapter.exercise;

import org.junit.Test;

import java.io.IOException;

public class FilePropertiesTest {

    @Test
    public void test() throws IOException {
        FileIO fileIO = new FileProperties();
        fileIO.readFromFile("file.txt");
        fileIO.setValue("year", "2004");
        fileIO.setValue("month", "4");
        fileIO.setValue("day", "21");
        fileIO.writeToFile("newfile.txt");
    }

}