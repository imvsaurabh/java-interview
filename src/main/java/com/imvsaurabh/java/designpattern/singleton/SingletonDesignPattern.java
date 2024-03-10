package com.imvsaurabh.java.designpattern.singleton;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        EagerInitializationSingleton eagerSingleton1 = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton eagerSingleton2 = EagerInitializationSingleton.getInstance();

        System.out.println("Eager singleton class 1 : " + eagerSingleton1);
        System.out.println("Eager singleton class 2 : " + eagerSingleton2);

//      ------------------------------------------------------------------------------------------

        LazyInitializationSingleton singletonNonSynchronized = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton singletonSynchronized = LazyInitializationSingleton.getInstanceSynchronized();
        LazyInitializationSingleton singletonSynchronizedDoubleCheckedLocking = LazyInitializationSingleton.getInstanceSynchronizedDoubleCheckedLocking();

        System.out.println("Lazy singleton class non synchronized : " + singletonNonSynchronized);
        System.out.println("Lazy singleton class synchronized : " + singletonSynchronized);
        System.out.println("Lazy singleton class synchronized double checked locking : " + singletonSynchronizedDoubleCheckedLocking);

    }
}
