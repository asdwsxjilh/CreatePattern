package com.yexm.pattern.create.factory;

public class PearFruitFactory implements FruitFactory{

    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}