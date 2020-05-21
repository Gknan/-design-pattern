package cn.hust.pattern.proxy.dynamicproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("Target teach.....");
    }
}
