package factory.after;

import factory.after.pizza.ChicagoStyleCheesePizza;
import factory.after.pizza.ChicagoStyleGreekPizza;
import factory.after.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new ChicagoStyleGreekPizza();
        }
        return pizza;
    }
}
