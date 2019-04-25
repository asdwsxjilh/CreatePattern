package com.yexm.pattern.create.factory;

import android.util.Log;

public class Apple implements Fruit {
    @Override
    public void plant() {
        Log.d("Yexm","plant Apple");
    }

    @Override
    public void eat() {
        Log.d("Yexm","eat Apple");
    }
}