package com.company.java3;
import java.lang.Math;

public class Circle {
    public double radius;
    public double perim;
    public double square;

    public double getPerim(){
        return perim;
    }

    public double getSquare() {
        return square;
    }

    public void setPerim(double radius){
        perim = 2*Math.PI*radius;
    }

    public void setSquare(double radius){
        square = Math.pow(radius, 2.0)*Math.PI;
    }
}
