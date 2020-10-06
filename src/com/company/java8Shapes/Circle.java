package com.company.java8Shapes;
import java.awt.*;
import java.util.Random;
import java.awt.Graphics;

public class Circle extends Figure {
    Random random = new Random();
    Graphics g;
    Graphics2D g2d = (Graphics2D)g;

    Circle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void go(){
        painting(g);
    }

    @Override
    public void painting(Graphics g){
        g2d.setColor(getColor());
        g2d.fillOval(getX1(), getY1(), getX2(), getY2());
    }

}
