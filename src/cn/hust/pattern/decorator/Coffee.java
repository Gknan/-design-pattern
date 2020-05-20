package cn.hust.pattern.decorator;

// 中间的缓冲层，用于封装子类共同的部分
public class Coffee extends Drink {
    @Override
    public double cost() {
        // 单品类咖啡直接就是单价
        return super.getPrice();
    }
}
