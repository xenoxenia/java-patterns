package com.company.Moveable;

public class MoveableRectangle implements Moveable{
    double width;
    double height;
    double centerx_of_rec, centery_of_rec;


    MoveableRectangle(double width, double height, double centerx_of_rec, double centery_of_rec){
        setWidth(width);
        setHeight(height);
        setCenterx_of_rec(centerx_of_rec);
        setCentery_of_rec(centery_of_rec);
    }

    public double getCenterx_of_rec() {
        return centerx_of_rec;
    }

    public double getCentery_of_rec() {
        return centery_of_rec;
    }

    public void setCenterx_of_rec(double centerx_of_rec) {
        this.centerx_of_rec = centerx_of_rec;
    }

    public void setCentery_of_rec(double centery_of_rec) {
        this.centery_of_rec = centery_of_rec;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void printing() {
        System.out.println("Ширина: "+ getWidth());
        System.out.println("Длина: "+ getHeight());
    }

    @Override
    public void move() {
        System.out.println("" +
                "Центр прямоугольника: " + "(" + centerx_of_rec + ", " + centery_of_rec + ")");
    }
}
