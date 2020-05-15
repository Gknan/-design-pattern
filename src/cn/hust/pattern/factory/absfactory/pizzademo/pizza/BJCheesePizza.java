package cn.hust.pattern.factory.absfactory.pizzademo.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("Beijing ChessePizza");
        System.out.println(name + "准备原材料");
    }
}
