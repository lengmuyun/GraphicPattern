package com.graphic.pattern.decorator;

public abstract class Display {

    /**
     * 获取横向字符数
     * @return
     */
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);

    public final void show() {
        for (int i=0; i<getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

}
