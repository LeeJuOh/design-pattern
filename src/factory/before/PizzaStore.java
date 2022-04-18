package factory.before;

import factory.before.pizza.CheesePizza;
import factory.before.pizza.GreekPizza;
import factory.before.pizza.PepperoniPizza;
import factory.before.pizza.Pizza;

public class PizzaStore {

    Pizza orderPizza(String type) {
        Pizza pizza = null;

        // 바뀌는 부분
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        // 바뀌지 않는 부분
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
