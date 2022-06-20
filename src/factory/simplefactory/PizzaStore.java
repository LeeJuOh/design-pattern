package factory.simplefactory;

import factory.before.pizza.Pizza;

// 간단한 팩토리를 이용한 방법
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
