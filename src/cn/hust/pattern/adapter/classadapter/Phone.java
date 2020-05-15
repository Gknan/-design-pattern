package cn.hust.pattern.adapter.classadapter;

public class Phone {

    public void charge(Voltage5V v) { // 依赖于适配之后的接口
        int dstV = v.output5V();
        if (dstV == 5) {
            System.out.println("charging on 5V");
        } else {
            System.out.println("can not charge cause voltage is not euqal to 5");
        }
    }
}
