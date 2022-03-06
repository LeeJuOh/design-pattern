package observer.after2;

import java.util.Observable;
import java.util.Observer;
import observer.after.DisplayElement;
import observer.after2.WeatherDataObservable;

public class CurrentConditionsDisplayObserver implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionsDisplayObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataObservable) {
            WeatherDataObservable weatherData = (WeatherDataObservable) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
