package cn.hust.pattern.factory.factorymethod.pizzademo;

import cn.hust.pattern.factory.factorymethod.pizzademo.order.BJPizzaOrder;
import cn.hust.pattern.factory.factorymethod.pizzademo.order.LDPizzaOrder;
import cn.hust.pattern.factory.factorymethod.pizzademo.order.PizzaOrder;
import cn.hust.pattern.factory.factorymethod.pizzademo.pizza.Pizza;

public class Client {

    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new BJPizzaOrder();
        Pizza cheese = pizzaOrder.getOrder("cheese");
        System.out.println(cheese);

        PizzaOrder ld = new LDPizzaOrder();
        Pizza pepper = ld.getOrder("pepper");
        System.out.println(pepper);
    }
}
