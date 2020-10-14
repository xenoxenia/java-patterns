package com.company.java9;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape extends JFrame {
    private Color color;
    private int x, y;
    private final Random rand = new Random();

    public Color getColor() {
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        color = new Color(r, g, b);
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        x = getRandNum();
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        y = getRandNum();
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRandNum() {
        return (int)(Math.random() * (500 - 1 + 1) + 1);
    }
    public abstract void draw(Graphics g);
}
