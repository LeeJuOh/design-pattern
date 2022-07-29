package adapter;

public class DuckTestDrive {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey  = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("turkey said that");
        turkey.gobble();
        turkey.fly();
        System.out.println();

        System.out.println("duck said that");
        testDuck(duck);
        System.out.println();

        System.out.println("turkeyAdapter said that");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
