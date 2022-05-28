package factory.after2;

import factory.after2.pizza.ChicagoStyleCheesePizza;
import factory.after2.pizza.ChicagoStyleGreekPizza;
import factory.after2.pizza.Pizza;

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
