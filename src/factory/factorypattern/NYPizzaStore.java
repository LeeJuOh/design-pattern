package factory.factorypattern;

import factory.factorypattern.pizza.NYStyleCheesePizza;
import factory.factorypattern.pizza.NYStyleGreekPizza;
import factory.factorypattern.pizza.Pizza;

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
