package cn.hust.pattern.strategy.improve;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术差");
    }
}
