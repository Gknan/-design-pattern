package cn.hust.pattern.singleton.type2;

public class SingletonDemo1 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/**
 * 饿汉式 静态代码块里创建实例
 */
class Singleton{

    static {
        instance = new Singleton();
    }

    // 1，私有化构造器
    private Singleton(){};

    // 2 类内部创建一个实例
    private final static Singleton instance;

    // 3 对外提供静态方法 getInstance
    public static Singleton getInstance() {
        return instance;
    }
}