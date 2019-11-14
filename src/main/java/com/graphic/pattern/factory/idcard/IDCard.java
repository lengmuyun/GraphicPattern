package com.graphic.pattern.factory.idcard;

import com.graphic.pattern.factory.framework.Product;

import java.util.UUID;

public class IDCard extends Product {

    private String owner;
    private String number;

    IDCard(String owner) {
        this.owner = owner;
        this.number = UUID.randomUUID().toString().replace("-", "");
        System.out.println("制作" + owner + "(" + number + ")" + "的ID卡。");
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "(" + number + ")" + "的ID卡。");
    }

    public String getOwner() {
        return owner;
    }

    public String getNumber() {
        return number;
    }
}
