package factory.after;

import factory.before.Pizza;

public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);

        // 바뀌지 않는 부분
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
