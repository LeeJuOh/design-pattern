package factory.simplefactory;

import factory.before.pizza.CheesePizza;
import factory.before.pizza.GreekPizza;
import factory.before.pizza.PepperoniPizza;
import factory.before.pizza.Pizza;

// 해당 클래스에서 하는 일은 클라이언트를 위해 피자를 만들어 주는 일 뿐이다.
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }

}
