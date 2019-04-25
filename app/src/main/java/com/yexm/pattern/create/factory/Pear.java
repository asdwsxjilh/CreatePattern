package com.yexm.pattern.create.factory;

import android.util.Log;

public class Pear implements Fruit {
    @Override
    public void plant() {
        Log.d("Yexm","plant Pear");
    }

    @Override
    public void eat() {
        Log.d("Yexm","eat Pear");
    }
}