package cn.hust.pattern.factory.factorymethod.pizzademo.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒Pizza");
        System.out.println(name + "正在准备");
    }
}
