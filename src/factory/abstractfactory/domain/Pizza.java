package factory.abstractfactory.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    public void box() {
        System.out.println("포장");
    }

    public void cut() {
        System.out.println("커팅");
    }

    public void bake() {
        System.out.println("굽기");
    }

    public abstract void prepare();
}
