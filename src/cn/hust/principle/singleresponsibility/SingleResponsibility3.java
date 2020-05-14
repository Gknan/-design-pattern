package cn.hust.principle.singleresponsibility;

/**
 * 没有遵循单一职责演示
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        NewVehicle vehicle = new NewVehicle();

        vehicle.runRoad("自行车");
        vehicle.runRoad("摩托车");
        vehicle.runWater("潜艇");
        vehicle.runAir("飞机");
    }
}

/*
没有在累级别遵循单一职责，方法级别的遵守
在类足够简单且类中方法足够少时可用
 */
class NewVehicle {

    public void runRoad(String vehicle) {
        System.out.println(vehicle + "正在公路上跑");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "正在水上跑");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "正在天上跑");
    }
}
