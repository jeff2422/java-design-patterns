package com.jeff.singleton;

/**
 * 测试类
 * Created by Aaron on 2019/8/14.
 */
public class Test {
    public static void main(String[] args) {

        /*for(int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton instance = Singleton.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }*/

        for(int i = 0; i < 10; i++) {
            new Thread(() -> {
                ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
                System.out.println(threadSafeSingleton.hashCode());
            }).start();
        }


    }
}
