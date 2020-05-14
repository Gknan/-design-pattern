package cn.hust.principle.interfacesegement;

public class InterfaceSegment1 {
}

interface Interface1 {
    public void opration1();
    public void opration2();
    public void opration3();
    public void opration4();
    public void opration5();

}

class A {
    private void operation1(Interface1 interface1) {
        interface1.opration1();
    }

    private void operation2(Interface1 interface1) {
        interface1.opration2();
    }

    private void operation3(Interface1 interface1) {
        interface1.opration3();
    }
}

class B implements Interface1 {
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

    @Override
    public void opration4() {
        System.out.println("B 实现了 opration4");
    }

    @Override
    public void opration5() {
        System.out.println("B 实现了 opration5");
    }
}

class C {
    public void operation1(Interface1 interface1) {
        interface1.opration1();
    }

    public void operation4(Interface1 interface1) {
        interface1.opration4();
    }

    public void operation5(Interface1 interface1) {
        interface1.opration5();
    }
}

class D implements Interface1 {

    @Override
    public void opration1() {
        System.out.println("D 实现了 opration1");
    }

    @Override
    public void opration2() {
        System.out.println("D 实现了 opration2");
    }

    @Override
    public void opration3() {
        System.out.println("D 实现了 opration3");
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