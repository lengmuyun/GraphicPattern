package com.graphic.pattern.strategy;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void test() {
        Player taro = new Player("Taro", new WinningStrategy(314));
        Player hana = new Player("Hana", new ProbStrategy(15));

        for (int i=0; i<10000; i++) {
            Hand nextHand1 = taro.nextHand();
            Hand nextHand2 = hana.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + taro);
                taro.win();
                hana.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner: " + hana);
                hana.win();
                taro.lose();
            } else {
                System.out.println("Even...");
                taro.even();
                hana.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(taro);
        System.out.println(hana);
    }

}