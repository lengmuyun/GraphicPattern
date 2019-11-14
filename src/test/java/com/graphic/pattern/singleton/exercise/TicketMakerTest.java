package com.graphic.pattern.singleton.exercise;

import org.junit.Test;

public class TicketMakerTest {

    @Test
    public void test() {
        System.out.println("Start.");
        for (int i=0; i<10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End.");
    }

}