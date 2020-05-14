package cn.hust.principle.ocp;

/**
 * 优点：简单易理解
 * 缺点：违背了 OCP 原则，对扩展开放，对修改关闭
 * 新增一个三角形的类，需要修改 GraphicEditor 方法
 */
public class OCP {

    public static void main(String[] args) {

        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Circle());
        editor.drawShape(new Rectangle());
    }
}

// 用于绘图的类
class GraphicEditor {

    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }
    }

    public void drawRectangle(Shape s) {
        System.out.println("矩形");
    }

    public void drawCircle(Shape s) {
        System.out.println("圆形");
    }
}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}