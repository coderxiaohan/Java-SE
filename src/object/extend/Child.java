package object.extend;

public class Child extends Parent{
    public Child(){
//        super(10);
        System.out.println("子类构造方法");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}
