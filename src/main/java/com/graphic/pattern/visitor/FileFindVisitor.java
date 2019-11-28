package com.graphic.pattern.visitor;

import com.graphic.pattern.composite.FileTreatmentException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {

    /** 文件名后缀 */
    private String suffix;

    private List<File> files = new ArrayList<>();

    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suffix)) {
            files.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        try {
            Iterator iterator = directory.iterator();
            while (iterator.hasNext()) {
                Entry next = (Entry) iterator.next();
                next.accept(this);
            }
        } catch (FileTreatmentException e) {
            // never go here
        }
    }

    public List<File> getFoundFiles() {
        return files;
    }

}
