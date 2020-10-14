package com.company.java9;

import java.awt.*;

public class Circle extends Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getRandNum(), getRandNum());
    }
}