package cn.hust.pattern.adapter.classadapter;

/**
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int srcV = output220V(); // 继承之后拥有了被适配的类的方法
        // 适配处理逻辑

        int desV = srcV / 44;

        return desV;
    }
}
