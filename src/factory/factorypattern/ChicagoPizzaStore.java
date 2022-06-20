package factory.factorypattern;

import factory.factorypattern.pizza.ChicagoStyleCheesePizza;
import factory.factorypattern.pizza.ChicagoStyleGreekPizza;
import factory.factorypattern.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new ChicagoStyleGreekPizza();
        }
        return pizza;
    }
}
