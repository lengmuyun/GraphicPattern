package com.graphic.pattern.singleton.exercise;

public class TicketMaker {

    private int ticket = 1000;

    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

}
