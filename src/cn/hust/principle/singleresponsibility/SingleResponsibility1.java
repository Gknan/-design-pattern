package cn.hust.principle.singleresponsibility;

/**
 * 没有遵循单一职责演示
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.run("自行车");
        vehicle.run("摩托车");
        vehicle.run("潜艇");
        vehicle.run("飞机");
    }
}

class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "正在公路上跑");
    }
}
