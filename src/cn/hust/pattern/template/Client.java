package cn.hust.pattern.template;

public class Client {

    public static void main(String[] args) {
        System.out.println("来一杯黑豆口味豆浆");
        SoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
        blackBeanSoyaMilk.make();

        System.out.println("======================");
        System.out.println("来一杯红豆口味豆浆");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
    }
}
