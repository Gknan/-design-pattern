package cn.hust.pattern.strategy.improve;

public class PekingDuck extends Duck {

    public PekingDuck() {
        // 传入策略类的实现类控制策略逻辑
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

}
