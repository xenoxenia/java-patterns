package com.company.java2_1;

public class Main {
    public static void main(String[] args) {
        Function func = (a, b) -> {
            int c = 0;

            while (a != b) {
                if (a > b) {
                    c = a - b;
                    a = c;
                }
                if (b > a) {
                    c = b - a;
                    b = c;
                }
            }
            return c;
        };
        System.out.println(func.NOD(140, 96));
    }
}
