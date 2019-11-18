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
    public void testRandomDisplay() {
        RandomDisplay randomDisplay = new RandomDisplay(new StringDisplayImpl("Hello, World!"));
        randomDisplay.randomDisplay(2);
    }

    @Test
    public void testFileDisplay() {
        CountDisplay d1 = new CountDisplay(new FileDisplayImpl("C:\\Users\\Administrator\\Desktop\\My Notes\\Star.txt"));
        d1.multiDisplay(3);
    }

    @Test
    public void testIncreaseDisplay() {
        IncreaseDisplay d1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay d2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        d1.increaseDisplay(4);
        d2.increaseDisplay(6);
    }

}