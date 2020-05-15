package cn.hust.pattern.factory.sinplefactory.pizzademo.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(name + "is baking use Greek Matiarials");
    }

}
