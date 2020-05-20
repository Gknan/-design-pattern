package cn.hust.pattern.decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink coffee) {
        super(coffee);

        setDes("Chocolate");
        setPrice(5.5f);
    }
}
