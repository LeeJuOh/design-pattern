package principle.leastknowledge;

// 최소 지식 원칙
public class Car {

    Engine engine; // 해당 클래스의 구성요소, 구성요소의 메소드는 호출해도 된다.

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(Key key) {            // 매개변수로 전달된 객체의 메소드는 호출 가능하다.
        Doors doors = new Doors();          // 새로운 객체를 생성, 해당 객체의 메소드 호출 가능
        boolean authorized = key.turns();   // 매개변수로 전달된 객체
        if (authorized) {
            engine.start();                 // 이 객체의 구성 요소를 대상으로 메소드 호출 가능
            updateDashboardDisplay();       // 객체 내에 있는 메소드 호출 가능
            doors.lock();                   // 직접 생성하거나 인스턴스를 만든 객체의 메소드 호출 가능
        }
    }

    private void updateDashboardDisplay() {
        // update display


    }
}
