package com.graphic.pattern.builder;

import org.junit.Test;

public class DirectorTest {

    @Test
    public void testTextBuilder() {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);
    }

    @Test
    public void testHtmlBuilder() {
        HtmlBuilder htmlBuilder = new HtmlBuilder();
        Director director = new Director(htmlBuilder);
        director.construct();
        String result = htmlBuilder.getResult();
        System.out.println(result);
    }

}