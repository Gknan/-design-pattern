package cn.hust.pattern.adapter.classadapter;

/**
 * 被适配的类
 */
public class Voltage220V {

    public int output220V() {
        int src = 220;
        System.out.println("原来的电压是：" + src + "V");
        return src;
    }
}
