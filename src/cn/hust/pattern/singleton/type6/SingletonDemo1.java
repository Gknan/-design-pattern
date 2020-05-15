package cn.hust.pattern.singleton.type6;

public class SingletonDemo1 {

    public static void main(String[] args) {
//        Singleton instance = Singleton.getInstance();
//        Singleton instance1 = Singleton.getInstance();
//        System.out.println(instance == instance1);
    }
}


/**
 * 双重检查
 */
class Singleton{
    private static volatile Singleton instance;

    // 私有化构造器
    private Singleton(){};

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}

