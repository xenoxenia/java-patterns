package com.company.java6;
import java.lang.Math;

 public class Circle extends Shape {
 private double radius;
 public double area;
 public double perim;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    Circle(){}

     Circle(double radius){
        setRadius(radius);
    }

    Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

     @Override
     public String toString() {
         return "Circle{" +
                 "radius=" + radius +
                 '}';
     }

     @Override
     public double getArea(){
        return area = Math.PI*radius*radius;
     }
     @Override
     public double getPerimetr(){
        return perim = 2*Math.PI*radius;
     }

 }