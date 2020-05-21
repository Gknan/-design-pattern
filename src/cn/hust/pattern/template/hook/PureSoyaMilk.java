package cn.hust.pattern.template.hook;

public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addMaterial() {
        // 空实现
    }

    /**
     * 是否添加配料，默认返回true，若不添加配料，返回 false
     * @return
     */
    @Override
    boolean customerAddMaterial() {
        return false;
    }
}
