package object2.homework;
class Base1{
    public Base1(String s){
        System.out.println("B");
    }
}

public class Derived extends Base1 {
    public Derived(String s){
        super("C");
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Derived("C");
    }
}
