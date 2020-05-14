package cn.hust.principle.liskow;

public class Liskow {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun1(11, 3));

        System.out.println("================");

        B b = new B();
        System.out.println(b.fun1(11, 3)); // 本意是求 11 -3
        System.out.println(b.fun2(11, 3));
    }
}

/*
抽取一个更基本的 base 类，采用聚合、组合的方式
 */
class A {
    public int fun1(int a, int b) {
        return a - b;
    }
}

class B extends A {
    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }
}
