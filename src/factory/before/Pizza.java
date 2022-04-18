package factory.before;

public abstract class Pizza {

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
        System.out.println("준비");
    }

}
