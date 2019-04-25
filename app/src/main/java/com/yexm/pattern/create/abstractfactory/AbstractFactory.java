package com.yexm.pattern.create.abstractfactory;

/**
 * 抽象工厂
 */
public interface AbstractFactory {

    Animal produceAnimal();

    Shape produceShape();
}