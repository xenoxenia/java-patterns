package com.company.java8Shapes;

import java.awt.*;


public abstract class Figure {
    int x1, y1, x2, y2;
    private Color color;

    Figure(int x1, int y1, int x2, int y2){
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public abstract void painting(Graphics g);

    public Color getColor(){
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);

        return new Color(r, g, b);
    }

    public void setColor(Color color){
        this.color = color;
    }

    public abstract void go();
}