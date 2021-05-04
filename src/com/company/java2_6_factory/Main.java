package com.company.java2_6_factory;
//фабричный метод
public class Main {
    public static void main(String[] args) {
        GroupsFactory gf = new BMTHFactory();
        Groups g = gf.createGroup();

        g.whichOne();
    }
}
