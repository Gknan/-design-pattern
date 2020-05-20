package cn.hust.pattern.observer.improve;

public class Client {

    public static void main(String[] args) {
        Subject subject = new WeatherData();

        Observer observer = new CurrentConditions();
        Observer sina = new SinaWeather();

        subject.registerObserver(observer);

        ((WeatherData) subject).set(11, 22, 33);

        System.out.println("=============");
        subject.registerObserver(sina);
        ((WeatherData) subject).set(44, 55, 23);

    }
}
