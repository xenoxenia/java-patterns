package com.company.java2_6;

public class MCRFactory  implements GroupsFactory{
    @Override
    public Groups createGroup() {
        return new MCR();
    }
}
