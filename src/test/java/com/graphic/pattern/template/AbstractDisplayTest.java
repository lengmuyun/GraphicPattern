package com.graphic.pattern.template;

import org.junit.Test;

public class AbstractDisplayTest {

    @Test
    public void test() {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello,World.");
        AbstractDisplay d3 = new StringDisplay("你好，世界。");
        d1.display();
        d2.display();
        d3.display();
    }

}