package com.company.java2_6;

public class BMTHFactory implements GroupsFactory{

    @Override
    public Groups createGroup() {
        return new BMTH();
    }
}
