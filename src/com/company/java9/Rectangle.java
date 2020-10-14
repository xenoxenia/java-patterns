package com.company.java9;

import java.awt.*;

public class Rectangle extends Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getRandNum(), getRandNum());
    }
}