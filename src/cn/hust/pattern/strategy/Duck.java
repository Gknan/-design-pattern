package cn.hust.pattern.strategy;

public abstract class Duck {

    public Duck() {}

    public void scream() {
        System.out.println("鸭子嘎嘎叫...");
    }

    public void swim() {
        System.out.println("鸭子会游泳...");
    }

    public void fly() {
        System.out.println("鸭子会飞...");
    }

    // 鸭子的描述，不同的鸭子描述不同，故为抽象，子类实现
    public abstract void display();
}
