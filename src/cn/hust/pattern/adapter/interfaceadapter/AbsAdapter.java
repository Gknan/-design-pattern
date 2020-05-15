package cn.hust.pattern.adapter.interfaceadapter;

/**
 * 抽象适配器类，对接口的所有方法进行空实现，子类需要哪个方法就对哪个方法进行实现
 */
public abstract class AbsAdapter implements InterfaceA {

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }

    @Override
    public void operation4() {

    }
}
