package com.company.java_patterns_3.Decorator;

public class App {
    public static void main(String[] args) {
        Boy SimpleBoy = new SimpleBoy();
        System.out.println("Body count of simple boy is - " + String.valueOf(SimpleBoy.bodyCount()));
        System.out.println("Number of games he played is - " + String.valueOf(SimpleBoy.gamesCount()));

        Boy FuckBoy = new FuckBoy(SimpleBoy);
        System.out.println("Body count of fuckboy is - " + String.valueOf(FuckBoy.bodyCount()));
        System.out.println("Number of games he played is - " + String.valueOf(FuckBoy.gamesCount()));

        Boy GamerBoy = new GamerBoy(SimpleBoy);
        System.out.println("Body count of gamer boy is - " + String.valueOf(GamerBoy.bodyCount()));
        System.out.println("Number of games he played is - " + String.valueOf(GamerBoy.gamesCount()));
    }
}
