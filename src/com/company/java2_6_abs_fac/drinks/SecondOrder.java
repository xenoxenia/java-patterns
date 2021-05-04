package com.company.java2_6_abs_fac.drinks;

import com.company.java2_6_abs_fac.tea.Matcha;
import com.company.java2_6_abs_fac.coffee.Latte;
import com.company.java2_6_abs_fac.coffee.Coffee;
import com.company.java2_6_abs_fac.tea.Tea;

public class SecondOrder implements Drinks{

    @Override
    public Tea drinkTea() {
        return new Matcha();
    }

    @Override
    public Coffee drinkCoffee() {
        return new Latte();
    }
}
