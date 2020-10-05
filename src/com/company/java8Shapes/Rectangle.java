package com.company.java8Shapes;

import java.awt.*;
import java.util.Random;

public class Rectangle extends Figure {

    Random random = new Random();
    Graphics g;

    Rectangle(int x1, int x2, int y1, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void painting(Graphics g) {
        g.drawRect(getX1(), getY1(), getX2(), getY2());
        g.fillRect(getX1(), getY1(), getX2(), getY2());
    }

    @Override
    public void setColor() {
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);

        Color color = new Color(r, g, b);
    }

    @Override
    public void go() {
        setColor();
        painting(g);
    }
}
