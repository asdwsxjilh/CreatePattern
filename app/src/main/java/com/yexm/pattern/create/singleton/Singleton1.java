package com.yexm.pattern.create.singleton;

/**
 * 饿汉模式
 */
public class Singleton1 {

    public final static Singleton1 instance = new Singleton1();

    private Singleton1(){}
}