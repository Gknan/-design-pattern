package cn.hust.pattern.template;

public abstract class SoyaMilk {

    void make() {
        select();
        addMaterial();
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
}
