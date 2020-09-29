package com.company.java7;

public abstract class Furniture {

    protected final float price;
    protected final String color;
    protected final String material;

    public Furniture(float price, String color, String material) {
        this.price = price;
        this.color = color;
        this.material = material;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}