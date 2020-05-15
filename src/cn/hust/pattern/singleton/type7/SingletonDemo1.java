package cn.hust.pattern.singleton.type7;

public class SingletonDemo1 {

    public static void main(String[] args) {
//        Singleton instance = Singleton.getInstance();
//        Singleton instance1 = Singleton.getInstance();
//        System.out.println(instance == instance1);
    }
}


/**
 * 静态内部类
 */
class Singleton{

    // 私有化构造器
    private Singleton(){};

    // 写一个静态内部类，该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE  = new Singleton();
    }

    public static Singleton getInstance() {
        // 导致 SingletonInstance 的装载，JVM 底层包保证线程安全
        return SingletonInstance.INSTANCE;
    }
}

