package com.graphic.pattern.strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {

    private Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int handvalue = random.nextInt(3);
        return Hand.getHand(handvalue);
    }

    @Override
    public void study(boolean win) {

    }

}
