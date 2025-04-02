package object2.package3;

public class Child extends Parent{
    static{
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类构造代码块");
    }
    public  Child(){
        System.out.println("子类构造方法");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}
