package cn.hust.pattern.factory.factorymethod.pizzademo.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("Longdong的胡椒Pizza");
        System.out.println(name + "正在准备");
    }
}
