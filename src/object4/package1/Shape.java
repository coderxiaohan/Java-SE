package object4.package1;

public abstract class Shape {
    // 抽象方法不能写方法的具体实现
    public abstract void draw();

    // 抽象类可以有属性
    private double area;
    private static int n = 0;

    // 抽象类可以有构造方法
    public Shape() {
        System.out.println("父类的构造方法");
        area = 10;
    }

    //抽象类也可以有普通的方法
    public double getArea(){
        return area;
    }

    //抽象类也可以有静态方法
    public static int getCount(){
        return n;
    }
}
