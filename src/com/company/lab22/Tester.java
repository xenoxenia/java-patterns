package com.company.lab22;

import java.util.HashMap;

public class Tester {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(10009, "Санек");
        Shop shop = new Shop();

        HashMap<String, String> INNs = new HashMap<>();
        INNs.put(customer.getName(), customer.getINN());

        Item item1 = new Item("крутая шапочка", 1000);
        Item item2 = new Item("подписка на спотифай", 3000);
        Item item3 = new Item("диск хэппи три френдс", 40);
        Item item4 = new Item("арматура", 100);

        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);
        shop.addItem(item4);

        shop.setINNs(INNs);

        customer.addProduct(shop, 1);

        shop.makeOrder(customer);

        Customer customer1 = new Customer(100, "name");
        customer1.addProduct(shop, 3);
        shop.makeOrder(customer1);
    }
}