package com.company.java2_6_abs_fac.app;

import com.company.java2_6_abs_fac.coffee.Coffee;
import com.company.java2_6_abs_fac.tea.Tea;
import com.company.java2_6_abs_fac.drinks.Drinks;

public class App {
    private Tea tea;
    private Coffee coffee;

    public App(Drinks drinks){
        tea = drinks.drinkTea();
        coffee = drinks.drinkCoffee();
    }
    public void drink(){
        tea.drink();
        coffee.drink();
    }
}
