package cn.hust.pattern.singleton.type4;

public class SingletonDemo1 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/**
 * 懒汉式（线程安全 同步方法）
 */
class Singleton{
    private static Singleton instance;

    private Singleton(){};

    // 提供一个静态的共有方法，当使用该方法时才创建实例
    // 加同步处理的方法，解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}