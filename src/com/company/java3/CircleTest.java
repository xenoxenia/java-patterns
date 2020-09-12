package com.company.java3;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double radius;
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
        Circle C = new Circle();
        C.setPerim(radius);
        C.setSquare(radius);
        System.out.println(C.getPerim());
        System.out.println(C.getSquare());
    }
}
