package cn.hust.pattern.singleton.type3;

public class SingletonDemo1 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/**
 * 懒汉式（线程不安全）
 */
class Singleton{
    private static Singleton instance;

    private Singleton(){};

    // 提供一个静态的共有方法，当使用该方法时才创建实例
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}