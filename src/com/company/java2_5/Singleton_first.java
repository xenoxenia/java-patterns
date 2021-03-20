package com.company.java2_5;

public class Singleton_first {
    private static Singleton_first instance;

    protected Singleton_first(){}

    public static Singleton_first getInstance() {
        if (instance == null) {
            instance = new Singleton_first();
        }
        return instance;
    }
}
