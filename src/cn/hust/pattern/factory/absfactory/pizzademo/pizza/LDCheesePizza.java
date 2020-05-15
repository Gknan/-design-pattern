package cn.hust.pattern.factory.absfactory.pizzademo.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("Longdong ChessePizza");
        System.out.println(name + "准备原材料");
    }
}
