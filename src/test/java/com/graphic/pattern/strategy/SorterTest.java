package com.graphic.pattern.strategy;

import org.junit.Test;

public class SorterTest {

    @Test
    public void testSelectionSorter() {
        String[] data = {
                "Dumpty", "Bowman", "Elfland", "Alice"
        };
        SorterAndPrint sap = new SorterAndPrint(data, new SelectionSorter());
        sap.execute();
    }

    @Test
    public void testBubbleSorter() {
        String[] data = {
                "Dumpty", "Bowman", "Elfland", "Alice"
        };
        SorterAndPrint sap = new SorterAndPrint(data, new BubbleSorter());
        sap.execute();
    }

}