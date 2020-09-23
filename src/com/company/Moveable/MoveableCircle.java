package com.company.Moveable;

public class MoveableCircle implements Moveable {
    double radius;
    double centerx, centery;
    double x, y;

    MoveableCircle(double radius, double centerx, double centery, double x, double y){
        setCenterx(centerx);
        setCentery(centery);
        setRadius(radius);
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void area(double radius){
        System.out.println(radius * radius * 3.14);
    }

    @Override
    public void printing() {
        System.out.println("радиус: " + getRadius());
        System.out.println("центр: " + getCenterx() + ", " + getCentery());
    }

    @Override
    public void move() {
        System.out.println("Moved to" + "(" + x + ", "+ y + ")");
    }

    public double getCenterx() {
        return centerx;
    }

    public double getCentery() {
        return centery;
    }

    public void setCentery(double centery) {
        this.centery = centery;
    }

    public void setCenterx(double centerx) {
        this.centerx = centerx;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
