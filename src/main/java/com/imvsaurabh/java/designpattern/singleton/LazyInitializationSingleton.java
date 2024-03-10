package com.imvsaurabh.java.designpattern.singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton INSTANCE = null;

    private LazyInitializationSingleton() {}

    public static LazyInitializationSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new LazyInitializationSingleton();
        }
        return INSTANCE;
    }

    public static synchronized LazyInitializationSingleton getInstanceSynchronized() {
        if(INSTANCE == null) {
            INSTANCE = new LazyInitializationSingleton();
        }
        return INSTANCE;
    }

    public static LazyInitializationSingleton getInstanceSynchronizedDoubleCheckedLocking() {
        if(INSTANCE == null) {
            synchronized (LazyInitializationSingleton.class) {
                INSTANCE = new LazyInitializationSingleton();
            }
        }
        return INSTANCE;
    }
}
