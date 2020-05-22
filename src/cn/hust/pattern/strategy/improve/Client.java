package cn.hust.pattern.strategy.improve;

public class Client {

    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();

        Duck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();

        Duck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();

    }
}
