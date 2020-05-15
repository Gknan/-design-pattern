package cn.hust.pattern.adapter.classadapter;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.charge(new VoltageAdapter()); // phone 依赖的是 Voltage5V 接口，但是这里传入的是 适配器类
    }
}
