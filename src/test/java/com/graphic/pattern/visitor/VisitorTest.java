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

    @Test
    public void testFileFindVisitor() throws FileTreatmentException {
        Directory rootdir = new Directory("root");

        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);

        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));

        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");

        usrdir.add(yuki);
        usrdir.add(hanako);
        usrdir.add(tomura);

        yuki.add(new File("diary.html", 100));
        yuki.add(new File("Composite.java", 200));

        hanako.add(new File("memo.tex", 300));
        hanako.add(new File("index.html", 350));

        tomura.add(new File("game.doc", 400));
        tomura.add(new File("junk.mail", 500));

        FileFindVisitor ffv = new FileFindVisitor(".html");
        rootdir.accept(ffv);

        System.out.println("HTML files are:");
        ffv.getFoundFiles().forEach(System.out::println);
    }

    @Test
    public void testSizeVisitor() throws FileTreatmentException {
        Directory root1 = new Directory("root1");
        root1.add(new File("dairy.html", 10));
        root1.add(new File("index.html", 20));

        Directory root2 = new Directory("root2");
        root2.add(new File("dairy.html", 1000));
        root2.add(new File("index.html", 2000));

        ElementArrayList list = new ElementArrayList();
        list.add(root1);
        list.add(root2);
        list.add(new File("etc.html", 1234));

        list.accept(new ListVisitor());
    }

}