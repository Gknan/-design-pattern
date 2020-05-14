package cn.hust.principle.dependencyreverse.improve;

/**
 * 演示不满足依赖导致的例子
 */
public class DependencyReverse1 {

    public static void main(String[] args) {
        IReceiver receiver = new EmailReceiver();

        Person person = new Person();

        person.setter(receiver);
        person.receive();
    }
}


// 方法是，通过传入接口
//interface IReceiver {
//    String receive();
//}
//
//class EmailReceiver implements IReceiver {
//
//    @Override
//    public String receive() {
//        return "Email recieve msg: Hello.";
//    }
//}
//
//class Person {
//    public void receive(IReceiver receiver) {
//        receiver.receive();
//    }
//}

// 方法二 ，通过构造器
//interface IReceiver {
//    String receive();
//}
//
//class EmailReceiver implements IReceiver {
//
//    @Override
//    public String receive() {
//        return "Email recieve msg: Hello.";
//    }
//}
//
//class Person {
//    IReceiver receiver;
//
//    public Person(IReceiver receiver) {
//        this.receiver = receiver;
//    }
//
//    public void receive() {
//        receiver.receive();
//    }
//}


// 方法三，通过 setter 方法
interface IReceiver {
    String receive();
}

class EmailReceiver implements IReceiver {

    @Override
    public String receive() {
        return "Email recieve msg: Hello.";
    }
}

class Person {
    IReceiver receiver;

    public void setter(IReceiver receiver) {
        this.receiver = receiver;
    }

    public void receive() {
        System.out.println(receiver.receive());
    }
}
