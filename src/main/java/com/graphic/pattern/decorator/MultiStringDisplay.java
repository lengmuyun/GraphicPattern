package com.graphic.pattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {

    private List<String> strings = new ArrayList<>();
    private int columns;

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        String string = strings.get(row);
        return string + appendSpace(string);
    }

    private String appendSpace(String string) {
        int count = columns - string.getBytes().length;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<count; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public void add(String string) {
        strings.add(string);
        updateColumns(string);
    }

    private void updateColumns(String string) {
        if (string.getBytes().length > columns) {
            columns = string.getBytes().length;
        }
    }

}
