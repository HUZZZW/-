package com.example.demo.principles.LazySingleton;

/**
 * @author Yiming Hu
 * @data 4/23/2023 12:27 PM
 * @Description:
 */
class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){
    }

    public static LazySingleton getInstance() {
        if(instance == null){
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
