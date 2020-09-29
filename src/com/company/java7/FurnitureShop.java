package com.company.java7;

import java.lang.reflect.Array;

public class FurnitureShop {
    Furniture[] furnitureShop = new Furniture[3];

    private void setFurnitureShop() {
        furnitureShop[0] = new Table( 59.99f, "Black", "oak", 1.5f);
        furnitureShop[1] = new Chair(19.99f, "White", "birch", 0.8f);
        furnitureShop[2] = new Sofa(109.99f, "Red", "leather", "single");
    }

    public Furniture buyFurniture(int index) {
        return furnitureShop[index - 1];
    }

    public void run() {
        setFurnitureShop();
        System.out.println("Assortment:");
        int i = 0;
        for (Furniture furniture : furnitureShop) {
            System.out.print(++i + ". ");
            System.out.println(furniture);
        }
    }
}