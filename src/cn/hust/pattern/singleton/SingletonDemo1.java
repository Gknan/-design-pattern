package cn.hust.pattern.singleton;

public class SingletonDemo1 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton{

    // 1，私有化构造器
    private Singleton(){};

    // 2 类内部创建一个实例
    private final static Singleton instance = new Singleton();

    // 3 对外提供静态方法 getInstance
    public static Singleton getInstance() {
        return instance;
    }
}