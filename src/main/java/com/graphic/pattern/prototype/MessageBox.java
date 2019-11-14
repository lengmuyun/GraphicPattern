package com.graphic.pattern.prototype;

public class MessageBox extends AbstractProduct {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        printDecochar(length);
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        printDecochar(length);
        System.out.println();
    }

    private void printDecochar(int length) {
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
    }

}
