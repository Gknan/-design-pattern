package cn.hust.pattern.factory.absfactory.pizzademo;

import cn.hust.pattern.factory.absfactory.pizzademo.order.BJFactory;
import cn.hust.pattern.factory.absfactory.pizzademo.order.PizzaOrder;

public class Client {

    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder(new BJFactory());
        pizzaOrder.createOrder("cheese");
        pizzaOrder.createOrder("pepper");
    }
}
