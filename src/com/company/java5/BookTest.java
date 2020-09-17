package com.company.java5;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        String name;
        int date;
        String author;
        String genre;

        Book book = new Book();
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        date = scan.nextInt();
        author = scan.next();
        genre = scan.next();

        book.setAuthor(author);
        book.setDate(date);
        book.setGenre(genre);
        book.setName(name);

        System.out.println(book.getAuthor());
        System.out.println(book.getDate());
        System.out.println(book.getGenre());
        System.out.println(book.getName());
    }
}
