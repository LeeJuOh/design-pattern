package decorator.before;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "다크 로스트";
    }

    @Override
    public double cost() {
        return super.cost() + 3500;
    }
}
