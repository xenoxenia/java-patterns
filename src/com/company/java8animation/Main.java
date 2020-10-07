package com.company.java8animation;

import javax.swing.*;

public class Main extends Animation{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("src/com/company/java8animation/kit.jpg").getImage());
        framlist.add(new ImageIcon("src/com/company/java8animation/kit2.jpg").getImage());
        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 2; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
