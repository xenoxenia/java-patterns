package com.company.java15;

public class CollectionTest{
    int[] arr = new int[] {2, 7, 9, 15, 3};
    int size = 5;

    public void test(){
        CollectionG col = new CollectionG(arr, size);
        System.out.println("Тесты:\nДобавление элемента:");
        col.add(20);
        System.out.println("Удаление элемента:");
        col.del();
        System.out.println("Поиск элемента со значением 9:");
        col.elemSearch(9);
        System.out.println("Поиск элемента с индексом 1:");
        col.indSearch(1);
        System.out.println("Поиск минимума:");
        col.searchMin();
        System.out.println("Поиск максимума:");
        col.searchMax();
        System.out.println("Поиск среднего значения:");
        col.searchAverg();
    }
}
