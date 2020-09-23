package com.company.Moveable;

import java.util.Scanner;

public class MoveableTester {
    public static void main(String[] args){
        double x, y, radius, centerx, centery;
        double width;
        double height;
        double centerx_of_rec, centery_of_rec;

        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();
        radius = sc.nextDouble();
        centerx = sc.nextDouble();
        centery = sc.nextDouble();
        width = sc.nextDouble();
        height = sc.nextDouble();
        centerx_of_rec = sc.nextDouble();
        centery_of_rec = sc.nextDouble();

        MoveablePoint mp = new MoveablePoint(x, y);
        MoveableCircle mc = new MoveableCircle(radius, centerx, centery, x, y);
        MoveableRectangle mr = new MoveableRectangle(width, height, centerx_of_rec, centery_of_rec);

        mp.move();
        mp.printing();

        mc.move();
        mc.printing();
        mc.area(radius);

        mr.printing();
        mr.move();
    }
}
