package factory.after;

import factory.after.pizza.Pizza;


// 팩토리 메소드 패턴
public abstract class PizzaStore {

    Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type); // 팩토리 객체가 아닌 메소드 호출

        // 바뀌지 않는 부분
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // 팩토리 객체 대신 해당 "메소드" 사용
    // "팩토리 메소드"가 추상 메소드로 바뀌었다.
    // 이제 Pizza 인스턴스를 만드는 일은 팩토리 역할을 하는 메소드에서 맡아서 처리한다.
    abstract Pizza createPizza(String type);

}
