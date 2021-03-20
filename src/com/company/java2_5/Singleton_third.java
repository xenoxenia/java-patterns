package com.company.java2_5;

public class Singleton_third {
    private static Singleton_third instance;
    public static Singleton_third getInstance() {
        if(instance == null) {
            instance = new Singleton_third();
            return instance;
        }
        return instance;
    }
    Singleton_third(){}
}

