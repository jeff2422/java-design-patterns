package com.jeff.singleton;

/**
 * 单例模式
 *
 * Created by Aaron on 2019/8/14.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){ }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
