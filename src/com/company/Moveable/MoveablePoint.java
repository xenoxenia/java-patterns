package com.company.Moveable;

public class MoveablePoint implements Moveable {
    double x;
    double y;

    MoveablePoint(double x, double y){
        setX(x);
        setY(y);
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void printing() {
        System.out.println("Координата x: "+ x);
        System.out.println("Координата y: "+ y);
    }

    @Override
    public void move() {
        System.out.println("the point is: " + "(" + x + ", " + y + ")");
    }
}
