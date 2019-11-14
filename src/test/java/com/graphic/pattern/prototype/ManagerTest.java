package com.graphic.pattern.prototype;

import org.junit.Test;

public class ManagerTest {

    @Test
    public void test() {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("waring box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, World.");
        Product p2 = manager.create("waring box");
        p2.use("Hello, World.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, World.");
    }

}