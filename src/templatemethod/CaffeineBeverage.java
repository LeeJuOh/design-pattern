package templatemethod;

import java.util.Arrays;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }

}
