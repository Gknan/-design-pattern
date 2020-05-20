package cn.hust.pattern.observer.improve;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;

    // 以集合方法管理所有的观察者
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    /** 更新数据 */
    public void set(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // 通知接入方
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // 遍历所有的 Observer，通知更新
        for (Observer observer: observers)
            observer.update(temperature, humidity, pressure);
    }
}
