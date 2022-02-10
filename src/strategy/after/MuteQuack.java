package strategy.after;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("소리 낼 수 없어요");
    }
}
