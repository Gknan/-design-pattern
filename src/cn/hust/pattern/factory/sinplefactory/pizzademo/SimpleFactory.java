package cn.hust.pattern.factory.sinplefactory.pizzademo;

import cn.hust.pattern.factory.sinplefactory.pizzademo.pizza.CheesePizza;
import cn.hust.pattern.factory.sinplefactory.pizzademo.pizza.GreekPizza;
import cn.hust.pattern.factory.sinplefactory.pizzademo.pizza.PepperPizza;
import cn.hust.pattern.factory.sinplefactory.pizzademo.pizza.Pizza;

/**
 * 提供创建 Pizza 的功能
 * 也叫静态工厂模式
 */
public class SimpleFactory {

    // 根据传入的 Pizza 类型创建 Pizza 并返回
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (pizzaType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (pizzaType.equals("pepper")) {
            pizza = new PepperPizza();
        }

        return pizza;
    }

    public static Pizza createPizza2(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (pizzaType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (pizzaType.equals("pepper")) {
            pizza = new PepperPizza();
        }

        return pizza;
    }
}
