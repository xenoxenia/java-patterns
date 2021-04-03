package com.company.java2_6;

public class Main {
    public static void main(String[] args) {
        GroupsFactory gf = new BMTHFactory();
        Groups g = gf.createGroup();

        g.whichOne();
    }
}
