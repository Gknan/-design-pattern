package cn.hust.pattern.strategy;

public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }


    // 默认从 Duck 父类继承的可以飞翔，但是子类并没有该功能，需要重写
    @Override
    public void fly() {
        System.out.println("北京鸭不会飞翔");
    }
}
