package cn.hust.pattern.factory.factorymethod.pizzademo.order;

import cn.hust.pattern.factory.factorymethod.pizzademo.pizza.*;

public class LDPizzaOrder extends PizzaOrder {
    @Override
    public Pizza createOrder(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (pizzaType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
