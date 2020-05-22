package cn.hust.pattern.strategy.improve;

public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();

        screamBehavior = new GuaguaScreamBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }


    // 玩具鸭不会叫、游泳和飞；子类需要重写父类的所有方法

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }
}
