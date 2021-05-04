package com.company.java2_6_abs_fac.drinks;

import com.company.java2_6_abs_fac.coffee.Coffee;
import com.company.java2_6_abs_fac.tea.Tea;
import com.company.java2_6_abs_fac.tea.BlackTea;
import com.company.java2_6_abs_fac.coffee.Cappuccino;

public class FirstOrder implements Drinks{
    @Override
    public Tea drinkTea() {
        return new BlackTea();
    }

    @Override
    public Coffee drinkCoffee() {
        return new Cappuccino();
    }
}
