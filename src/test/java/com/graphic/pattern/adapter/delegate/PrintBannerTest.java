package com.graphic.pattern.adapter.delegate;

import org.junit.Test;

public class PrintBannerTest {

    @Test
    public void test() {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }

}