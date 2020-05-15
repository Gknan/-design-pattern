package cn.hust.pattern.singleton.type5;

public class SingletonDemo1 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/**
 * 懒汉式（线程不安全 同步代码块）
 */
class Singleton{
    private static Singleton instance;

    private Singleton(){};

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}