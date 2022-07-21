package com.atgx.principle.ocp.improve;

/**
 * @author lgx
 * @description: 开闭原则
 * @date 2022/6/2112:09
 */
public class OCPImprove {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

//Shape类，基类
abstract class Shape {
    int m_type;

    public abstract void draw();//抽象方法
}

//这是一个用于绘图的类 [使用方]
class GraphicEditor {
    //接收Shape对象，调用draw方法
    public void drawShape(Shape s) {
        s.draw();
    }


}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制圆形 ");
    }
}
//新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制三角形 ");
    }
}
//新增一个图形
class OtherGraphic extends Shape {
    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制其它图形 ");
    }
}
