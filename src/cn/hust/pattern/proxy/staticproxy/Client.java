package cn.hust.pattern.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();


        ITeacherDao proxy = new TeacherDaoProxy(target);

        proxy.teach();
    }
}
