package com.graphic.pattern.factory.idcard;

import com.graphic.pattern.factory.framework.Factory;
import com.graphic.pattern.factory.framework.Product;
import org.junit.Test;

public class IDCardFactoryTest {

    @Test
    public void test() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }

}