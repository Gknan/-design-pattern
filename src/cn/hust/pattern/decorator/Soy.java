package cn.hust.pattern.decorator;

public class Soy extends Decorator {

    public Soy(Drink coffee) {
        super(coffee);

        setDes("soy");
        setPrice(2.3f);
    }
}
