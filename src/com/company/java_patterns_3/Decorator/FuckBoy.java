package com.company.java_patterns_3.Decorator;

public class FuckBoy implements Boy{
    private Boy boy;

    public FuckBoy(Boy boy){
        this.boy = boy;
    }

    @Override
    public int bodyCount() {
        return this.boy.bodyCount() + 50;
    }

    @Override
    public int gamesCount() {
        return this.boy.gamesCount();
    }

}
