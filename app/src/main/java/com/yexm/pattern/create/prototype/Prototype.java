package com.yexm.pattern.create.prototype;

/**
 * 原型模式
 */
public class Prototype implements Cloneable{

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }
}