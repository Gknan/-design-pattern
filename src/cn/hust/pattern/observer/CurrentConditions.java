package cn.hust.pattern.observer;

/**
 * 显示当前天气状况，相当于气象站等第三方接入方
 */
public class CurrentConditions {

    private float temperature;
    private float pressure;
    private float humidity;

    /** 提供给外部使用的接口，当天气数据发生变化时，通知当前对象更新数据 */
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        // 更新展示的数据
        display();
    }


    /** 显示当前天气状况 */
    public void display() {
        System.out.println("当前温度：" + temperature);
        System.out.println("当前湿度：" + humidity);
        System.out.println("当前气压：" + pressure);
    }
}
