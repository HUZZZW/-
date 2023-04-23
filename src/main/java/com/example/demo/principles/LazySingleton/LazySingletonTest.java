package com.example.demo.principles.LazySingleton;

/**
 * @author Yiming Hu
 * @data 4/23/2023 12:26 PM
 * @Description:
 */
public class LazySingletonTest {
    public static void main(String[] args) {
//        LazySingleton instance = LazySingleton.getInstance();
//        LazySingleton instance1 = LazySingleton.getInstance();
//        System.out.println(instance1 == instance);
        new Thread(()->{
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();
        new Thread(()->{
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();
    }
}
