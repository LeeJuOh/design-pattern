package factory.after;

import factory.after.pizza.NYStyleCheesePizza;
import factory.after.pizza.NYStyleGreekPizza;
import factory.after.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new NYStyleGreekPizza();
        }
        return pizza;
    }
}
