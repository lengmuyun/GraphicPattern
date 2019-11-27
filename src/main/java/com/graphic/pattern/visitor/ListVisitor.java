package com.graphic.pattern.visitor;

import com.graphic.pattern.composite.FileTreatmentException;

import java.util.Iterator;

public class ListVisitor extends Visitor {

    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        try {
            Iterator iterator = directory.iterator();
            while(iterator.hasNext()) {
                Entry entry = (Entry) iterator.next();
                entry.accept(this);
            }
            currentdir = savedir;
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }

}
