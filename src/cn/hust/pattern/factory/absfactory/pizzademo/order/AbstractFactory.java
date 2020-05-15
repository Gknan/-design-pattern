package cn.hust.pattern.factory.absfactory.pizzademo.order;

import cn.hust.pattern.factory.absfactory.pizzademo.pizza.Pizza;

/**
 * 抽象工厂模式中的抽象层（接口），提供子类工厂实现的方法
 */
public interface AbstractFactory {

    // 子类工厂实现
    public Pizza createPizza(String pizzaType);
}
