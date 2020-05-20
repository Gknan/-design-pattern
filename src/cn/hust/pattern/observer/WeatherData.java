package cn.hust.pattern.observer;

/**
 * 核心类，提供更新 天气、温度、湿度的接口；一旦数据发生变化，通知接入方更新
 */
public class WeatherData {

    private float temperature;
    private float pressure;
    private float humidity;

    // 聚合进第三接入方 CurrentConditions
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    /** 更新数据 */
    public void set(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // 通知接入方
        currentConditions.update(temperature, pressure, humidity);
    }
}
