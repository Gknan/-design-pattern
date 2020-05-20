package cn.hust.pattern.decorator;

public class CoffeeBar {

    public static void main(String[] args) {
        // 单点一份 Decaf
        Drink drink = new Decaf();
        System.out.println("单点一份 Decaf, cost="+drink.cost());

        // Decaf 加上 一份巧克力
        drink = new Chocolate(drink);
        System.out.println("Decaf + 一份巧克力，cost=" + drink.cost());

        // Decaf 加上一份巧克力一份牛奶
        drink = new Milk(drink);
        System.out.println("Decaf 巧克力 牛奶，cost=" + drink.cost());
    }
}
