package scratch5;

public class DrawShape {
    public static void drawshapes(){
        // 我们创建了一个 Shape 对象的数组.
        Shape[] shapes = {new Cycle(), new Rect(), new Flower(), new Cycle(), new Rect(), new Triangle()};
        for(Shape shape : shapes){
            shape.draw();
        }
    }
    public static void main(String[] args) {
        drawshapes();
    }
}
