package com.company.java7;

public class Sofa extends Furniture {
    private final String space;

    public Sofa(float price, String color, String material, String space) {
        super(price, color, material);
        this.space = space;
    }

    public String getSpace() {
        return space;
    }

    @Override
    public String toString() {
        return this.color + " sofa made of " + this.material + ":\n" +
                "Price: " + this.price + "\nSpace: " + this.space;
    }
}