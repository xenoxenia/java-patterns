package com.company.java7;

public class Table extends Furniture {

    private final float area;

    public Table(float price, String color, String material, float area) {
        super(price, color, material);
        this.area = area;
    }

    public float getArea() {
        return area;
    }

    @Override
    public String toString() {
        return this.color + " table made of " + this.material + ":\n" +
                "Price: " + this.price + "\nArea: " + this.area;
    }
}