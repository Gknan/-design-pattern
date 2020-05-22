package cn.hust.pattern.strategy.improve;

public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
        screamBehavior = new GuaguaScreamBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
