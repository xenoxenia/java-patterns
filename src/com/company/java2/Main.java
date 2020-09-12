package com.company.java2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner scan = new Scanner(System.in);
        DogNursery doggu = new DogNursery();
        name = scan.next();
        while(!(name.equals("stop"))) {
            age = scan.nextInt();
            Dog d = new Dog(name, age);
            System.out.println(d.dogAge(age));
            System.out.println(d.toString());
            doggu.dogAdd(name, age);
            name = scan.next();
        }
        doggu.dogsShow();
    }
}
