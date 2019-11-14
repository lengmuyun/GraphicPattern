package com.graphic.pattern.singleton.exercise;

import org.junit.Test;

public class TripleTest {

    @Test
    public void test() {
        System.out.println("Start.");
        for (int i=0; i<9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("End.");
    }

}