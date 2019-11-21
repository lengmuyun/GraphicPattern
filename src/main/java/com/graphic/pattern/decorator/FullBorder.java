package com.graphic.pattern.decorator;

public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return getUpOrDownBorder();
        }
        return "|" + display.getRowText(row - 1) + "|";
    }

    private String getUpOrDownBorder() {
        return "+" + makeLine('-', display.getColumns()) + "+";
    }

    private String makeLine(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

}
