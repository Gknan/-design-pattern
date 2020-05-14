package cn.hust.principle.singleresponsibility;

/**
 * 没有遵循单一职责演示
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {

        RoadVehicle roadVehicle = new RoadVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        AirVehicle airVehicle = new AirVehicle();

        roadVehicle.run("自行车");
        roadVehicle.run("摩托车");
        waterVehicle.run("潜艇");
        airVehicle.run("飞机");
    }
}

/*
根据单一职责按照类划分
优点是完全遵循单一职责
缺点是代码改动大，客户端，功能代码均改动
 */
class RoadVehicle {

    void run(String vehicle) {
        System.out.println(vehicle + "正在公路上跑");
    }
}

class WaterVehicle {

    void run(String vehicle) {
        System.out.println(vehicle + "正在水上跑");
    }
}

class AirVehicle {

    void run(String vehicle) {
        System.out.println(vehicle + "正在天空上跑");
    }
}
