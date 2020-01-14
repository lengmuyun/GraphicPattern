package com.graphic.pattern.facade;

import org.junit.Test;

public class PageMakerTest {

    @Test
    public void testMakeWelcomePage() {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }

    @Test
    public void testMakeLinkPage() {
        PageMaker.makeLinkPage("linkpage.html");
    }

}