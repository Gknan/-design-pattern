package cn.hust.pattern.factory.sinplefactory.pizzademo.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + " is making with its matiarials.");
    }
}
