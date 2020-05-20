package cn.hust.pattern.observer.improve;

public class SinaWeather implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;


    /** 显示当前天气状况 */
    public void display() {
        System.out.println("新浪天气更新");
        System.out.println("当前温度：" + temperature);
        System.out.println("当前湿度：" + humidity);
        System.out.println("当前气压：" + pressure);
    }

    /** 提供给外部使用的接口，当天气数据发生变化时，通知当前对象更新数据 */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        display();
    }
}
