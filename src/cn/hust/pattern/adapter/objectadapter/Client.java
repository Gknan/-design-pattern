package cn.hust.pattern.adapter.objectadapter;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("============方法适配器==========");

        Phone phone = new Phone();

        Voltage220V v = new Voltage220V();
        phone.charge(new VoltageAdapter(v)); // phone 依赖的是 Voltage5V 接口，但是这里传入的是 适配器类
    }
}
