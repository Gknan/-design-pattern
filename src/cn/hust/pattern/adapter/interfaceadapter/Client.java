package cn.hust.pattern.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {

        // 匿名内部类的方式重写了关心的方法
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void operation1() {
                System.out.println("重写了 operation1");
            }
        };

        absAdapter.operation1();
    }
}
