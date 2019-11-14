package com.graphic.pattern.singleton.exercise;

public class SingletonTest {

    public static void main(String[] args) {
        System.out.println("Start.");
        new Thread(new InstanceRunnable("A")).start();
        new Thread(new InstanceRunnable("B")).start();
        new Thread(new InstanceRunnable("C")).start();
        System.out.println("End.");
    }

    public static class InstanceRunnable implements Runnable {

        private String name;

        public InstanceRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            Singleton obj = Singleton.getInstance();
            System.out.println(name + ": obj=" + obj);
        }

    }

}