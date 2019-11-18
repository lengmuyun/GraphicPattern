package com.graphic.pattern.bridge;

import java.util.Random;

public class RandomDisplay extends CountDisplay {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        // 返回[0, times + 1)
        int randomTimes = new Random().nextInt(times + 1);
        multiDisplay(randomTimes);
    }

}
