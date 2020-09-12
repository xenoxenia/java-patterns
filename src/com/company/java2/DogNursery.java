package com.company.java2;

import java.util.ArrayList;

public class DogNursery {
    ArrayList <Dog> dogs = new ArrayList <Dog>();

    public void dogAdd(String name, int age){
        dogs.add(new Dog(name, age));
    }
    public void dogsShow(){
            System.out.println(dogs);

    }
}
