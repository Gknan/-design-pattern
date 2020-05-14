package cn.hust.principle.liskow.improve;

public class Liskow {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun1(11, 3));

        System.out.println("================");

        B b = new B();
        // 因为 B 类不再继承 A，所以 fun1 方法就是 B 中的方法
        // 所以 B 的fun1 的方法功能是明确的
        System.out.println(b.fun1(11, 3)); // 本意是求 11 + 3
        System.out.println(b.fun2(11, 3));

        // 使用 组合让然可以使用 A的方法
        System.out.println(b.fun3(11, 3));
    }
}

/*
抽取一个更基本的 base 类，采用聚合、组合的方式
 */

// 创建一个更基础的类
class Base {
    // A B 中的基础的方式和成员放在 Base 中
}

class A extends Base {
    public int fun1(int a, int b) {
        return a - b;
    }
}

class B extends Base {
    // 如果 B 中需要使用 A类的，使用 组合
    private A a = new A();
    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }

    // 使用 A 的方法
    public int fun3(int a, int b) {
        return this.a.fun1(a, b);
    }
}
