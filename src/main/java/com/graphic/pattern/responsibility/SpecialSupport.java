package com.graphic.pattern.responsibility;

public class SpecialSupport extends Support {

    private final int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return number == trouble.getNumber();
    }

}
