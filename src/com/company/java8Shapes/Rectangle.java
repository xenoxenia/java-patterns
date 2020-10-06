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
        g.setColor(getColor());
        g.fillRect(getX1(), getY1(), getX2(), getY2());
    }

    @Override
    public void go() {
        painting(g);
    }
}
