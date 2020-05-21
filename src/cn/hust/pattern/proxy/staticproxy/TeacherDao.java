package cn.hust.pattern.proxy.staticproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("Target teach.....");
    }
}
