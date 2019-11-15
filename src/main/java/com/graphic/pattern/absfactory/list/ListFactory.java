package com.graphic.pattern.absfactory.list;

import com.graphic.pattern.absfactory.framework.Factory;
import com.graphic.pattern.absfactory.framework.Link;
import com.graphic.pattern.absfactory.framework.Page;
import com.graphic.pattern.absfactory.framework.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }

}
