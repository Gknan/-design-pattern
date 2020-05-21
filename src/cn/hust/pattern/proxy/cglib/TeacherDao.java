package cn.hust.pattern.proxy.cglib;

public class TeacherDao {

    public String teach() {
        System.out.println("cglib 代理中的目标对象的目标方法...");

        return "success";
    }
}
