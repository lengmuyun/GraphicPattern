package com.graphic.pattern.absfactory.table;

import com.graphic.pattern.absfactory.framework.Factory;
import com.graphic.pattern.absfactory.framework.Link;
import com.graphic.pattern.absfactory.framework.Page;
import com.graphic.pattern.absfactory.framework.Tray;

public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }

}
