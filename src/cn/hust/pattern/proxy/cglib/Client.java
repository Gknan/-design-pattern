package cn.hust.pattern.proxy.cglib;

public class Client {

    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();

        ProxyFactory proxyFactory = new ProxyFactory(target);

        TeacherDao proxyInstance = (TeacherDao) proxyFactory.getProxyInstance();

        String ret = proxyInstance.teach();

        System.out.println(ret);
    }
}
