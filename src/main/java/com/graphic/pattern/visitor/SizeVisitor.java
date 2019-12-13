package com.graphic.pattern.visitor;

import com.graphic.pattern.composite.FileTreatmentException;

import java.util.Iterator;

public class SizeVisitor extends Visitor {

    private int size = 0;

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        try {
            Iterator iterator = directory.iterator();
            while (iterator.hasNext()) {
                Entry entry = (Entry) iterator.next();
                entry.accept(this);
            }
        } catch (FileTreatmentException e) {
            // never go here
        }
    }

    public int getSize() {
        return size;
    }

}
