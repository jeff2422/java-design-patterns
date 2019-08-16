package com.jeff.singleton;

/**
 * 线程安全单例模式（双重检查）
 *
 * Created by Aaron on 2019/8/14.
 */
public class ThreadSafeSingleton {

    private volatile static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton(){ } // 私有化构造方法，禁止通过new的方式创建对象

    public static ThreadSafeSingleton getInstance() {

        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
