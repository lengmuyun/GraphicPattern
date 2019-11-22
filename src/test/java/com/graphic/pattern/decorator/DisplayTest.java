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

    @Test
    public void testUpDownBorder() {
        StringDisplay b1 = new StringDisplay("Hello, world.");
        UpDownBorder b2 = new UpDownBorder(b1, '-');
        SideBorder b3 = new SideBorder(b2, '*');

        b1.show();
        b2.show();
        b3.show();

        Display b4 = new FullBorder(new UpDownBorder(new SideBorder(new UpDownBorder(new SideBorder(new StringDisplay("Hello, world"), '*'), '='), '|'), '/'));
        b4.show();
    }

    @Test
    public void testMultiStringDisplay() {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Good morning.");
        md.add("Good afternoon.");
        md.add("Good night. See you tomorrow.");
        md.show();

        SideBorder d1 = new SideBorder(md, '#');
        d1.show();

        FullBorder d2 = new FullBorder(md);
        d2.show();
    }

}