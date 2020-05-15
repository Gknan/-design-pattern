package cn.hust.pattern.adapter.objectadapter;

/**
 * 适配器类
 */
public class VoltageAdapter implements Voltage5V {

    Voltage220V voltage220V; // 聚合关系

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int desV = 0;

        if (voltage220V != null) {
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配器开始转换");
            desV = srcV / 44;
            System.out.println("适配转换完成");
        }

        return desV;
    }
}
