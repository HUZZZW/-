package com.example.demo.principles.HungrySingleton;

/**
 * @author Yiming Hu
 * @data 4/23/2023 6:27 PM
 * @Description:
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){};

    public static HungrySingleton getInstance() { 
        return instance;
    }
}
