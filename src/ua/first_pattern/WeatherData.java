package ua.first_pattern;

import java.util.ArrayList;
import java.util.Observer;

public class WeatherData implements Subject{
   private ArrayList observers;
   private float temperature;
   private float humidity;
   private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
int i = observers.indexOf(o);
if (i>=0){
    observers.remove(i);
}
    }

    @Override
    public void notifyObservers() {

    }
}