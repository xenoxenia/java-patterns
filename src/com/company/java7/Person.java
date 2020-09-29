package com.company.java7;

import java.util.ArrayList;

public class Person {
    ArrayList<Furniture> cart = new ArrayList<>();

    public float cartSum() {
        float sum = 0f;
        for (Furniture furniture : cart) {
            sum += furniture.getPrice();
        }
        return sum;
    }
}
