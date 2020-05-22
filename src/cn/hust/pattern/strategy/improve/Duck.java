package cn.hust.pattern.strategy.improve;

public abstract class Duck {

    // 聚合进策略接口
    FlyBehavior flyBehavior;
    ScreamBehavior screamBehavior;

    public Duck() {}

    public void scream() {
        if (screamBehavior != null) {
            screamBehavior.scream();
        }
    }

    public void swim() {
        System.out.println("鸭子会游泳...");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    // 鸭子的描述，不同的鸭子描述不同，故为抽象，子类实现
    public abstract void display();
}
