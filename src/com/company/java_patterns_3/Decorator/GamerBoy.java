package com.company.java_patterns_3.Decorator;

public class GamerBoy implements Boy{
    private Boy boy;
    public GamerBoy(Boy boy){
        this.boy = boy;
    }

    @Override
    public int bodyCount() {
        return this.boy.bodyCount();
    }

    @Override
    public int gamesCount() {
        return this.boy.gamesCount() + 100;
    }
}
