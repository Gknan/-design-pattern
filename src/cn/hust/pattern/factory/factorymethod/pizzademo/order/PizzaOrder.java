package cn.hust.pattern.factory.factorymethod.pizzademo.order;

import cn.hust.pattern.factory.factorymethod.pizzademo.pizza.Pizza;

/**
 * 工厂方法模式中的抽象工厂
 * 提供抽象方法，实例化由工厂子类完成
 */
public abstract class PizzaOrder {

    // 留给子类实例化
    public abstract Pizza createOrder(String pizzaType);

    public Pizza getOrder(String pizzaType) {
        Pizza pizza = createOrder(pizzaType);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }
}
