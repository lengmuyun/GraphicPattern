package com.graphic.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return directory.stream().mapToInt(Entry::getSize).sum();
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        directory.add(entry);
        entry.parent = this;
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        directory.forEach(entry -> entry.printList(prefix + "/" + name));
    }

}
