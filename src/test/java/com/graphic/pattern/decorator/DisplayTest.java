package com.graphic.pattern.decorator;

import org.junit.Test;

public class DisplayTest {

    @Test
    public void test() {
        StringDisplay b1 = new StringDisplay("Hello, world.");
        SideBorder b2 = new SideBorder(b1, '#');
        FullBorder b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();

        SideBorder b4 = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("Hello, world。")), '*'))), '/');
        b4.show();
    }

}