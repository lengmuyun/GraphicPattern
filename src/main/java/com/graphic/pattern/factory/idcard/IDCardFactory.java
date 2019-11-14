package com.graphic.pattern.factory.idcard;

import com.graphic.pattern.factory.framework.Factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory<IDCard> {

    private List<String> owners = new ArrayList<>();
    private Map<String, String> numberToOwner = new HashMap<>();

    @Override
    protected void registerProduct(IDCard product) {
        owners.add(product.getOwner());
        numberToOwner.put(product.getNumber(), product.getOwner());
    }

    @Override
    protected IDCard createProduct(String owner) {
        return new IDCard(owner);
    }

    public List<String> getOwners() {
        return owners;
    }

    public String getOwner(String number) {
        return numberToOwner.get(number);
    }

}
