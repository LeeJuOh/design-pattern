package factory.abstractfactory;

import factory.abstractfactory.domain.CheesePizza;
import factory.abstractfactory.domain.GreekPizza;
import factory.abstractfactory.domain.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("greek")) {
            pizza = new GreekPizza(ingredientFactory);
        }
        return pizza;
    }
}
