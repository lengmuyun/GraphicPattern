package com.graphic.pattern.strategy;

import org.junit.Before;
import org.junit.Test;

public class SorterTest {

    private String[] data;

    @Before
    public void init() {
        data = new String[] {
                "Dumpty", "Bowman", "Elfland", "Alice"
        };
    }

    @Test
    public void testSelectionSorter() {
        testSorter(new SelectionSorter());
    }

    @Test
    public void testBubbleSorter() {
        testSorter(new BubbleSorter());
    }

    private void testSorter(Sorter sorter) {
        SorterAndPrint sap = new SorterAndPrint(data, sorter);
        sap.execute();
    }

}