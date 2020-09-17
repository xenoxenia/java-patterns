package com.company.java4;

import java.util.Scanner;

public class Human {
    public static void main(String[] args){
        String hair_color;
        int number_of_teeth;
        String nails_color;
        boolean rings;
        int size;
        boolean broken;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цвет волос: ");
        hair_color = scan.next();
        System.out.println("Введите количество зубов: ");
        number_of_teeth = scan.nextInt();
        System.out.println("Введите цвет ногтей: ");
        nails_color = scan.next();
        System.out.println("Есть ли кольца? true/false: ");
        rings = scan.nextBoolean();
        System.out.println("Введите размер ноги: ");
        size = scan.nextInt();
        System.out.println("Ломали ли когда-нибудь кости на ногах? true/false: ");
        broken = scan.nextBoolean();

        Hand hand = new Hand();
        Leg leg = new Leg();
        Head head = new Head();

        hand.setNails_color(nails_color);
        hand.setRings(rings);
        leg.setBroken(broken);
        leg.setSize(size);
        head.setHair_color(hair_color);
        head.setNumber_of_teeth(number_of_teeth);

        System.out.println(hand.getNailsColor());
        System.out.println(hand.getRings());
        System.out.println(leg.getSize());
        System.out.println(leg.isBroken());
        System.out.println(head.getHairColor());
        System.out.println(head.getNumber_of_teeth());
    }
}
