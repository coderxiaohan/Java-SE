package object2.package3;

public class Parent {
    static{
        System.out.println("parent 静态代码块");
    }

    {
        System.out.println("Parent 构造代码块");
    }
     public Parent(){
         System.out.println("Parent 构造方法");
     }
}
