package com.graphic.pattern.strategy;

public class Hand {

    public static final int HANDVALUE_GUU = 0; // 表示石头的值
    public static final int HANDVALUE_CHO = 1; // 表示剪刀的值
    public static final int HANDVALUE_PAA = 2; // 表示布的值

    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    private static final String[] name = {
            "石头", "剪刀", "布"
    };

    private int handvalue;

    public Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) {
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        }
        if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return name[handvalue];
    }

}