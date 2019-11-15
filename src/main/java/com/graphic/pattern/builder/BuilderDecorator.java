package com.graphic.pattern.builder;

public class BuilderDecorator implements Builder {

    private boolean initTitle;
    private Builder builder;

    public BuilderDecorator(Builder builder) {
        this.builder = builder;
        this.initTitle = false;
    }

    @Override
    public void makeTitle(String title) {
        if (!initTitle) {
            builder.makeTitle(title);
            initTitle = true;
        }
    }

    @Override
    public void makeString(String str) {
        if (initTitle) {
            builder.makeString(str);
        }
    }

    @Override
    public void makeItems(String[] items) {
        if (initTitle) {
            builder.makeItems(items);
        }
    }

    @Override
    public void close() {
        if (initTitle) {
            builder.close();
        }
    }

}
