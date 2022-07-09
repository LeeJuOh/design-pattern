package singleton.dcl;

public class Singleton {

    //
    private volatile static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        if(uniqueInstance == null) { // 인스턴스가 있는지 확인하고, 없으면 동기화된 블럭으러 진입
            synchronized (Singleton.class) {
                if(uniqueInstance == null) { // 블록으로 들어온 후레도 다시 한번 널체크한 후, 인스턴스를 생성한다.
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
