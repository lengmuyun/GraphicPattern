package com.graphic.pattern.bridge;

import org.junit.Test;

public class DisplayTest {

    @Test
    public void testDisplay() {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        CountDisplay d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();

        d3.multiDisplay(5);
    }

    @Test
    public void testFileDisplay() {
        Display d1 = new Display(new FileDisplayImpl("C:\\Users\\Administrator\\Desktop\\My Notes\\docker.md"));
        d1.display();
    }

    @Test
    public void testSpecialString() {
        Display d1 = new Display(new SpecialStringDisplayImpl('<', '>', "*", 4));
        d1.display();

        Display d2 = new Display(new SpecialStringDisplayImpl('|', '-', "##", 6));
        d2.display();
    }

}