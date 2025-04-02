package object3.package1;

public class Test {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        Rect rect = new Rect();
//        Flower flower = new Flower();
//        String[] shapes = {"Circle","Rect","Rect","Flower"};
//        for(String shape : shapes){
//            if(shape.equals("Circle")){
//                circle.draw();
//            }else if(shape.equals("Rect")){
//                rect.draw();
//            }else if (shape.equals("Flower")){
//                flower.draw();
//            }
//        }

        Shape[] shapes = {new Circle(),new Rect(),new Rect(),new Flower(), new Triangle()};
        for(Shape shape : shapes){
            shape.draw();
        }
    }
}
