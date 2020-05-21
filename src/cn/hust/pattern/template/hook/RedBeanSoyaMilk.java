package cn.hust.pattern.template.hook;

public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addMaterial() {
        System.out.println("添加来自东北黑土地的上好红豆");
    }
}
