package cn.hust.principle.dependencyreverse;

/**
 * 演示不满足依赖导致的例子
 */
public class DependencyReverse1 {

    public static void main(String[] args) {
        Person person = new Person();

    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：Hello World";
    }
}

// 方法1 分析
// 1，简单，容易想到
// 2，如果从微信、短信获取消息等等，需要新增类，同时 person 类也要增加相应的接收方法
// 3，解决思路，引入一个抽象的 Reciver，表示接收者，Person 类与 接口 IRevicer 发生以来，
// Email 和 Weixin 都是属于接口的范围，他们各自实现 IReciever
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
