package cn.hust.principle.interfacesegement.improve;

public class InterfaceSegment2 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.operation1(b);
        a.operation2(b);
        a.operation3(b);

        c.operation1(d);
        c.operation4(d);
        c.operation5(d);
    }

}

interface Interface1 {
    public void opration1();
}

interface Interface2 {
    public void opration2();
    public void opration3();
}

interface Interface3 {
    public void opration4();
    public void opration5();
}


// 类 A 通过 接口依赖 B（使用 B）
class A {
    public void operation1(Interface1 interface1) {
        interface1.opration1();
    }

    public void operation2(Interface2 interface1) {
        interface1.opration2();
    }

    public void operation3(Interface2 interface1) {
        interface1.opration3();
    }
}

class B implements Interface1, Interface2 {
    @Override
    public void opration1() {
        System.out.println("B 实现了 opration1");
    }

    @Override
    public void opration2() {
        System.out.println("B 实现了 opration2");
    }

    @Override
    public void opration3() {
        System.out.println("B 实现了 opration3");
    }
}

class C {
    public void operation1(Interface1 interface1) {
        interface1.opration1();
    }

    public void operation4(Interface3 interface1) {
        interface1.opration4();
    }

    public void operation5(Interface3 interface1) {
        interface1.opration5();
    }
}

class D implements Interface1, Interface3 {

    @Override
    public void opration1() {
        System.out.println("D 实现了 opration1");
    }

    @Override
    public void opration4() {
        System.out.println("D 实现了 opration4");
    }

    @Override
    public void opration5() {
        System.out.println("D 实现了 opration5");
    }
}