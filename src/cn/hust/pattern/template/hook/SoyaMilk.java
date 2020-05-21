package cn.hust.pattern.template.hook;

public abstract class SoyaMilk {

    void make() {
        select();
        if (customerAddMaterial()) {
            addMaterial();
        }
        soak();
        boil();
    }

    // final 修饰，防止子类覆盖
    final void select() {
        System.out.println("挑选上好的黄豆原材料，黄豆取材天山");
    }

    abstract void addMaterial();

    void soak() {
        System.out.println("独家工艺浸泡 28.8h，充分吸收水分");
    }

    void boil() {
        System.out.println("138 道工艺打磨加工，锁住天然风味");
    }

    // 返回值决定是否添加配料，默认添加；若不添加，重写该方法，返回 false
    boolean customerAddMaterial() {
        return true;
    }
}
