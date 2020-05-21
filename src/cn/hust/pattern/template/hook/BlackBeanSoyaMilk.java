package cn.hust.pattern.template.hook;

public class BlackBeanSoyaMilk extends SoyaMilk {
    @Override
    void addMaterial() {
        System.out.println("添加来自内蒙古大草原的黑豆");
    }
}
