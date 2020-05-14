package cn.hust.principle.ocp.improve;

/**
 * 使用抽象类抽象 shape，并提供抽象方法 draw
 *
 */
public class OCP {

    public static void main(String[] args) {

        GraphicEditor editor = new GraphicEditor();
        editor.draw(new Rectangle());
        editor.draw(new Circle());

        editor.draw(new Triangle());
    }
}

// 用于绘图的类
class GraphicEditor {

    public void draw(Shape shape) {
        shape.draw();
    }
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("圆形");
    }
}

class Triangle extends Shape {

    @Override
    void draw() {
        System.out.println("三角形");
    }
}