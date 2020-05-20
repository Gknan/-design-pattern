package cn.hust.pattern.decorator;

public class Espresso extends Coffee {

    public Espresso() {
        // 构造器中设置 des price
        setDes("Espresso");
        setPrice(23.0f);
    }
}
