package com.company.java2_6_abs_fac;

import com.company.java2_6_abs_fac.drinks.FirstOrder;
import com.company.java2_6_abs_fac.drinks.SecondOrder;
import com.company.java2_6_abs_fac.drinks.Drinks;
import com.company.java2_6_abs_fac.app.App;

public class Demo {
    public static App configureApp(){
        App app;
        Drinks drinks;
        String order = "Second";
        if (order.equals("First")){
            drinks = new FirstOrder();
            app = new App(drinks);
        }
        else{
            drinks = new SecondOrder();
            app = new App(drinks);
        }
        return app;
    }

    public static void main(String[] args) {
        App app = configureApp();
        app.drink();
    }
}
