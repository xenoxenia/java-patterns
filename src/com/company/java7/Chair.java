package com.company.java7;

public class Chair extends Furniture {

    private final float height;

    public Chair(float price, String color, String material, float height) {
        super(price, color, material);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.color + " chair made of " + this.material + ":\n" +
                "Price: " + this.price + "\nHeight: " + this.height;
    }
}
