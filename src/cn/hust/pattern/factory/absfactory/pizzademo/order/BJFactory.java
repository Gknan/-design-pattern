package cn.hust.pattern.factory.absfactory.pizzademo.order;

import cn.hust.pattern.factory.absfactory.pizzademo.pizza.BJCheesePizza;
import cn.hust.pattern.factory.absfactory.pizzademo.pizza.BJPepperPizza;
import cn.hust.pattern.factory.absfactory.pizzademo.pizza.Pizza;

public class BJFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (pizzaType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
