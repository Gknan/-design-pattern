package cn.hust.pattern.factory.absfactory.pizzademo.order;

import cn.hust.pattern.factory.absfactory.pizzademo.pizza.*;

public class LDFactory implements AbstractFactory {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (pizzaType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
