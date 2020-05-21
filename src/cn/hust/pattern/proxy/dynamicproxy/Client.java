package cn.hust.pattern.proxy.dynamicproxy;

public class Client {

    public static void main(String[] args) {
        ITeacherDao proxy = (ITeacherDao)ProxyFactory.getInstance();

        proxy.teach();// 代理对象执行 增强后的方法

        System.out.println(proxy);
    }
}
