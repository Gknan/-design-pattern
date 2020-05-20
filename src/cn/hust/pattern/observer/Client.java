package cn.hust.pattern.observer;

public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);

        weatherData.set(23, 33,2);

        System.out.println("天气发生变化");
        weatherData.set(33, 22, 3);
    }
}
