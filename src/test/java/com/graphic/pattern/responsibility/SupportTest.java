package com.graphic.pattern.responsibility;

import org.junit.Before;
import org.junit.Test;

public class SupportTest {

    private Support alice;

    @Before
    public void initialize() {
        alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
    }

    @Test
    public void test() {
        for (int i=0; i<500; i+=33) {
            alice.support(new Trouble(i));
        }
    }

    @Test
    public void testLoopSupport() {
        for (int i=0; i<500; i+=33) {
            alice.loopSupport(new Trouble(i));
        }
    }

}