package com.company.java2_2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        List<Human> Hums = new ArrayList<>();

        Hums.add(new Human(25, "Oliver", "Sykes", LocalDate.of(1986, 11, 26), 90));
        Hums.add(new Human(30, "Ivan", "Ivanov", LocalDate.of(1990, 9, 5), 11));
        Hums.add(new Human(19, "Saveliy", "Pavlov", LocalDate.of(2001, 8, 10), 50));
        Hums.add(new Human(19, "Yuliya", "Guschina", LocalDate.of(2001, 12, 29), 46));
        Stream<Human> humans = Hums.stream();

        Hums.stream().sorted(Comparator.comparing(Human::getSecLet)).forEach(System.out::println);
        System.out.println();
        Hums.stream().filter(human->(human.getWeight()%10 == 0)).forEach(System.out::println);
        System.out.println();
        Hums.stream().sorted(Comparator.comparing(human->(human.getWeight()*human.getAge()))).forEach(System.out::println);
        System.out.println();

        int sum = 1;
        sum *= humans.mapToInt(Human::getWeight).reduce(1,(a, b) -> a*b);
        System.out.println(sum);
    }

}
