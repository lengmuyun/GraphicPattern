package com.graphic.pattern.visitor;

import java.util.ArrayList;

public class ElementArrayList extends ArrayList<Entry> implements Element {

    @Override
    public void accept(Visitor visitor) {
        forEach(entry -> entry.accept(visitor));
    }

}
