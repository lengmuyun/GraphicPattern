package com.graphic.pattern.decorator;

public class UpDownBorder extends Border {

    private final char ch;

    public UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return makeLine(ch, display.getColumns());
        }
        return display.getRowText(row - 1);
    }

}
