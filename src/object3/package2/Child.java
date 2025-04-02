package object3.package2;

public class Child extends Parent{
    public int num = 10;
    @Override
    public void fun() {
        System.out.println("Child.fun, num = " + num);
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}

