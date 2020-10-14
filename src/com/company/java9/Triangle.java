package com.company.java9;

import java.awt.*;

public class Triangle extends Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillPolygon(new int[] {getRandNum(), getRandNum(), getRandNum()}, new int[] {getRandNum(), getRandNum(), getRandNum()}, 3);
    }
}