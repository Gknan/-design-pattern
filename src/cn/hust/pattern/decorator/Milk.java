package cn.hust.pattern.decorator;

public class Milk extends Decorator {
    public Milk(Drink coffee) {
        super(coffee);

        setDes("milk");
        setPrice(3.3f);
    }
}
