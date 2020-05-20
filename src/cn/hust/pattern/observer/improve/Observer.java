package cn.hust.pattern.observer.improve;

/**
 * 订阅者接口
 */
public interface Observer {

    public void update(float temperature, float humidity, float pressure);
}
