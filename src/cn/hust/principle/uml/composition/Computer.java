package cn.hust.principle.uml.composition;

public class Computer {

    private Mouce mouce = new Mouce(); // 鼠标可以和电脑不可分离
    private Monitor monitor = new Monitor(); //

    public void setMouce(Mouce mouce) {
        this.mouce = mouce;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
