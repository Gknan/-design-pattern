package cn.hust.principle.uml.aggregation;

public class Computer {

    private Mouce mouce; // 鼠标可以和电脑分离
    private Monitor monitor; // 显示器也可以和电脑分离

    public void setMouce(Mouce mouce) {
        this.mouce = mouce;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
