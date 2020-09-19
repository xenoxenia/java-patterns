package com.company.java6;

import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        String color;
        double width;
        double lenght;
        boolean filled;
        double radius;

        Scanner scan = new Scanner(System.in);

        color = scan.next();
        width = scan.nextDouble();
        lenght = scan.nextDouble();
        filled = scan.nextBoolean();
        radius = scan.nextDouble();

        Rectangle rt = new Rectangle(width, lenght, color, filled);
        Square sq = new Square(width);
        Circle cl = new Circle(radius, color, filled);

        System.out.println(rt.toString());
        System.out.println(sq.toString());
        System.out.println(cl.toString());
    }

}
