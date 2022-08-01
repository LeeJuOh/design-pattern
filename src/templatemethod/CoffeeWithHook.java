package templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverage { // 후크를 오버라이드해서 원하는 기능을 추가

    @Override
    protected void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    protected void addCondiments() {
        System.out.println("설탕과 우류를 추가하는 중");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = br.readLine();
        } catch (IOException exception) {
            System.out.println("io exception");

        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
