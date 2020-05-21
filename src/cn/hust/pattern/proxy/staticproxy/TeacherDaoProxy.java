package cn.hust.pattern.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao {

    // 聚合 目标对象
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        // 自定义的前置的操作，若权限校验等
        System.out.println("proxy execute some ops.....");

        // 被代理对象的目标方法
        target.teach();

        // 自定义的后置操作
        System.out.println("proxy execute some post-ops.....");
    }
}
