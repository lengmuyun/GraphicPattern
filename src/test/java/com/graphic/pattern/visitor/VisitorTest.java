package com.graphic.pattern.visitor;

import com.graphic.pattern.composite.FileTreatmentException;
import org.junit.Test;

public class VisitorTest {

    @Test
    public void test() throws FileTreatmentException {
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");

        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);

        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        rootdir.accept(new ListVisitor());

        System.out.println();
        System.out.println("Making user entries...");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");

        usrdir.add(yuki);
        usrdir.add(hanako);
        usrdir.add(tomura);

        yuki.add(new File("diary.html", 100));
        File composite = new File("Composite.java", 200);
        yuki.add(composite);

        hanako.add(new File("memo.tex", 300));

        tomura.add(new File("game.doc", 400));
        tomura.add(new File("junk.mail", 500));

        rootdir.accept(new ListVisitor());
    }

}