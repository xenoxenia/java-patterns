package com.company.java2_6_factory;

public class BMTHFactory implements GroupsFactory{

    @Override
    public Groups createGroup() {
        return new BMTH();
    }
}
