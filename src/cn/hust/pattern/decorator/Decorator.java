package cn.hust.pattern.decorator;

/**
 * 装饰者类
 */
public class Decorator extends Drink {

    // 被装饰者
    private Drink coffee; // 组合一个 Drink 对象

    public Decorator(Drink coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        // 价格是配料的价格+coffee的价格
        return coffee.cost() + getPrice();
    }
}
