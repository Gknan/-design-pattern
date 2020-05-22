package cn.hust.pattern.strategy.improve;

public class GuaguaScreamBehavior implements ScreamBehavior {
    @Override
    public void scream() {
        System.out.println("呱呱叫");
    }
}
