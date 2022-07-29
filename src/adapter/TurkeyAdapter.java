package adapter;

// 우선 적응시킬 형식의 인터페이스를 구현해야 한다. 즉 클라이언트에서 원하는 인터페이스를 구현해야 한다.
public class TurkeyAdapter implements Duck {


    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) { // 그리고 기존 형식 객체의 레퍼런스가 필요한다.
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    /*
     두 인터페이스에 모두 fly가 있지만 turkey의 fly() 메소드를 Duck의 fly() 메소드에 대응시키도록 작성
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
