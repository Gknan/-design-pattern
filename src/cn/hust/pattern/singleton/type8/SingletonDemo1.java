package cn.hust.pattern.singleton.type8;

public class SingletonDemo1 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());

        instance.sayOK();
    }
}

/**
 * 枚举
 */
enum  Singleton{
    INSTANCE; // 属性

    public void sayOK() {
        System.out.println("Ok...");
    }
}

