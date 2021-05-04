package com.company.java2_6_factory;

public class MCRFactory  implements GroupsFactory{
    @Override
    public Groups createGroup() {
        return new MCR();
    }
}
