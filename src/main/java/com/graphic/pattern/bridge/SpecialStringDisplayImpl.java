package com.graphic.pattern.bridge;

public class SpecialStringDisplayImpl extends DisplayImpl {

    private char startChar;
    private char endChar;
    private String decorator;
    private int lineNum;

    public SpecialStringDisplayImpl(char startChar, char endChar, String decorator, int lineNum) {
        this.startChar = startChar;
        this.endChar = endChar;
        this.decorator = decorator;
        this.lineNum = lineNum;
    }

    @Override
    public void rawOpen() {

    }

    @Override
    public void rawPrint() {
        String lastDecorator = "";
        for (int i=0; i<lineNum; i++) {
            System.out.println(startChar + lastDecorator + endChar);
            lastDecorator += decorator;
        }
    }

    @Override
    public void rawClose() {

    }

}
