package com.company.java14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Фамилия", "Имя"));
        students.add(new Student("Сидоров", "Сидр"));
        students.add(new Student("Федоров", "Федор"));
        students.add(new Student("Германцев", "Герман"));
        students.add(new Student("Сёрнейм", "Форнейм"));

        /*
        students.sort(new SortingStudentsByGPA()); //by GPA
        Collections.shuffle(students);             //shuffled
        Collections.sort(students, Comparator.comparing(Student::getIdNumber)); //by ID
         */
        //System.out.println(students.toString());

        //merge sort
        Collections.shuffle(students);
        long startTime = System.nanoTime();
        Merge sorter1 = new Merge();
        sorter1.mergeSort(students, 0, students.size()-1);
        System.out.println("Merge Sort time: " + (System.nanoTime() - startTime));

        //quick sort
        Collections.shuffle(students);
        startTime = System.nanoTime();
        Quick sorter2 = new Quick();
        sorter2.quick(students, 0, students.size()-1);
        System.out.println("Quick Sort time: " + (System.nanoTime() - startTime));

        Binary searcher1 = new Binary();
        startTime = System.nanoTime();
        searcher1.binaryItSearch(students, 3);
        System.out.println("Iterative binary search time: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        searcher1.binaryRecSearch(students, 0, students.size() - 1, 3);
        System.out.println("Recursive binary search time: " + (System.nanoTime() - startTime));

        Linear searcher2 = new Linear();
        startTime = System.nanoTime();
        searcher2.linear(students, 3);
        System.out.println("Quick Sort time: " + (System.nanoTime() - startTime));
    }
}