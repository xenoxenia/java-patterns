package com.company.java8Shapes;
import java.awt.*;
import java.util.Random;
import java.lang.Math;
import java.awt.Graphics;

public class Circle extends Figure {
    Graphics g;
    Random random = new Random();

    Circle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void go(){
        setColor();
        painting(g);
    }
    @Override
    public void setColor() {
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);

        Color color = new Color(r, g, b);
    }

    @Override
    public void painting(Graphics g){
        g.drawOval(getX1(), getY1(), getX2(), getY2());
        g.fillOval(getX1(), getY1(), getX2(), getY2());
    }

}
