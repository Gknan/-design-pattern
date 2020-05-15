package cn.hust.principle.uml.composition;

public class Person {

    private Head head = new Head(); // 组合关系；不可分开
    private IDCard idCard; // 聚合关系，可分开


}
