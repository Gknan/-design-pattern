package cn.hust.pattern.factory.sinplefactory.pizzademo.order;

import cn.hust.pattern.factory.sinplefactory.pizzademo.SimpleFactory;
import cn.hust.pattern.factory.sinplefactory.pizzademo.pizza.CheesePizza;
import cn.hust.pattern.factory.sinplefactory.pizzademo.pizza.GreekPizza;
import cn.hust.pattern.factory.sinplefactory.pizzademo.pizza.Pizza;

public class PizzaOrder {

    // 聚合 SimpletFactory
    SimpleFactory simpleFactory;

    public PizzaOrder(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void createOrder(String pizzaType) {
        System.out.println("使用简单工厂模式创建 Pizza");
        Pizza pizza = simpleFactory.createPizza(pizzaType);

        if (pizza != null) {
            pizza.setName(pizzaType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
