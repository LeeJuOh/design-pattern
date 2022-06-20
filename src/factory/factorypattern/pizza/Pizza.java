package factory.factorypattern.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void box() {
        System.out.println("포장");
    }

    public void cut() {
        System.out.println("커팅");
    }

    public void bake() {
        System.out.println("굽기");
    }

    public void prepare() {
        System.out.println("준비: " + name);
        System.out.println("도우 생성");
        System.out.println("소스 추가");
        System.out.println("토핑 추가");
        toppings.forEach(System.out::println);
    }
}
