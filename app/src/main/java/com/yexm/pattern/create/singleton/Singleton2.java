package com.yexm.pattern.create.singleton;

/**
 * 懒汉模式
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2(){}

    public Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}