package factory.after2;

import factory.after2.pizza.NYStyleCheesePizza;
import factory.after2.pizza.NYStyleGreekPizza;
import factory.after2.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new NYStyleGreekPizza();
        }
        return pizza;
    }
}
