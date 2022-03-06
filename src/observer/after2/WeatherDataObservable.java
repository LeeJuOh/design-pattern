package observer.after2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import observer.after.Observer;
import observer.after.Subject;

public class WeatherDataObservable extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataObservable() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers(); // pull 방식, push 방식인 경우 notifyObservers(Object arg);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // pull 방식이므로 옵저버가 주체 객체의 상태를 알아야하므로 필요하다.
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
