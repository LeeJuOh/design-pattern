package strategy.before;

public abstract class Duck {

    void quack() {
        System.out.println("duck quack");
    }

    void swim() {
        System.out.println("duck swim");
    }

    abstract void display();

    void fly() {
        System.out.println("duck fly");
    }

}

class RubberDuck extends Duck {

    @Override
    void quack() {
        System.out.println("rubber duck quack");
    }

    @Override
    void display() {
        System.out.println("Rubber Duck");
    }
}

class MallardDuck extends Duck {

    @Override
    void display() {
        System.out.println("Mallard Duck");
    }
}

class RedheadDuck extends Duck {

    @Override
    void display() {
        System.out.println("Redhead Duck");
    }
}
