package cn.hust.pattern.factory.sinplefactory.pizzademo.pizza;

public abstract class Pizza {

    public String name;

    // 不同的披萨使用的原材料不同
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " is baking.");
    }

    public void cut() {
        System.out.println(name + " is cuting.");
    }

    public void box() {
        System.out.println(name + " is boxing");
    }

    public void setName(String name) {
        this.name = name;
    };
}
