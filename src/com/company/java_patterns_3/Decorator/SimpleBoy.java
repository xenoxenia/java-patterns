package com.company.java_patterns_3.Decorator;

public class SimpleBoy implements Boy {

    private int bodyCount = 2;
    private int gameCount = 10;

    @Override
    public int bodyCount() {
        return bodyCount;
    }

    @Override
    public int gamesCount() {
        return gameCount;
    }
}
