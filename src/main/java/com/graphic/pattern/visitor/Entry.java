package com.graphic.pattern.visitor;

import com.graphic.pattern.composite.FileTreatmentException;

import java.util.Iterator;
import java.util.Stack;

public abstract class Entry implements Element {

    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

}
