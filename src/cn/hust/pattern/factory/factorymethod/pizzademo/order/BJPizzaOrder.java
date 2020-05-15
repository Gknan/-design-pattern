package cn.hust.pattern.factory.factorymethod.pizzademo.order;

import cn.hust.pattern.factory.factorymethod.pizzademo.pizza.*;

public class BJPizzaOrder extends PizzaOrder {
    @Override
    public Pizza createOrder(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (pizzaType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
