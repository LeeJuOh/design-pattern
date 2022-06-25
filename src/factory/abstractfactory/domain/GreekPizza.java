package factory.abstractfactory.domain;

import factory.abstractfactory.PizzaIngredientFactory;

public class GreekPizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public GreekPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
