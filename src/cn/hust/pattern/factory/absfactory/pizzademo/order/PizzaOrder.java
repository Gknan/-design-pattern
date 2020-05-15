package cn.hust.pattern.factory.absfactory.pizzademo.order;

import cn.hust.pattern.factory.absfactory.pizzademo.pizza.Pizza;

public class PizzaOrder {

    // 聚合 SimpletFactory
    AbstractFactory factory;

    public PizzaOrder(AbstractFactory factory) {
        this.factory = factory;
    }

    public Pizza createOrder(String pizzaType) {
        System.out.println("使用抽象工厂模式创建 Pizza");
        Pizza pizza = factory.createPizza(pizzaType);

        if (pizza != null) {
            pizza.setName(pizzaType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }
}
