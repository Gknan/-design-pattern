package cn.hust.pattern.strategy;

public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }


    // 玩具鸭不会叫、游泳和飞；子类需要重写父类的所有方法

    @Override
    public void scream() {
        System.out.println("玩具鸭不会叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞");
    }
}
