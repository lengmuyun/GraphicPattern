package com.graphic.pattern.strategy;

public class BubbleSorter implements Sorter {

    @Override
    public void sort(Comparable[] data) {
        for (int i=0; i<data.length; i++) {
            for (int j=0; j<data.length-i-1; j++) {
                if (data[j].compareTo(data[j+1]) > 0) {
                    Comparable temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

}
