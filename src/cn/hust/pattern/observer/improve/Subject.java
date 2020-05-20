package cn.hust.pattern.observer.improve;

/**
 * 订阅主题接口；规定订阅、移除、通知方法
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);


    /**
     * 通知所有订阅者更新数据
     */
    public void notifyObservers();
}
