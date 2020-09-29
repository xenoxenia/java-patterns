package com.company.java7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        Person customer = new Person();
        shop.run();
        int choice;

        while (true) {
            System.out.println("Which one do you want to buy? 0 - end");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
            customer.cart.add(shop.buyFurniture(choice));
            System.out.println("Wanna buy anything else?");
        }

        System.out.println("Sum of cart" + customer.cartSum());
    }
}