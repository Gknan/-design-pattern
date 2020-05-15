package cn.hust.pattern.factory.sinplefactory.pizzademo;

import cn.hust.pattern.factory.sinplefactory.pizzademo.order.PizzaOrder;
import cn.hust.pattern.factory.sinplefactory.pizzademo.pizza.Pizza;

public class Client {

    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder(new SimpleFactory());
        pizzaOrder.createOrder("cheese");
        pizzaOrder.createOrder("pepper");
    }
}
