package com.graphic.pattern.factory.framework;

public abstract class Factory<T extends Product> {

    public final T create(String owner) {
        T p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract void registerProduct(T product);
    protected abstract T createProduct(String owner);

}
