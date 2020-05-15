package cn.hust.pattern.factory.sinplefactory.pizzademo.pizza;

public class CheesePizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println(name + " is preparing with its matiarials");
    }
}
