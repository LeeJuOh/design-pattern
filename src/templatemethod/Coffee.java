package templatemethod;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    protected void addCondiments() {
        System.out.println("설탕과 우류를 추가하는 중");
    }


}
