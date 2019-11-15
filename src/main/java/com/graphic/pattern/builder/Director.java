package com.graphic.pattern.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        doConstruct(new BuilderDecorator(builder));
    }

    private void doConstruct(BuilderDecorator builderDecorator) {
        builderDecorator.makeTitle("Greeting");
        builderDecorator.makeString("从早上到下午");
        builderDecorator.makeItems(new String[] {
                "早上好。",
                "下午好。"
        });
        builderDecorator.makeString("晚上");
        builderDecorator.makeItems(new String[] {
                "晚上好。",
                "晚安。",
                "再见。"
        });
        builderDecorator.close();
    }

}
