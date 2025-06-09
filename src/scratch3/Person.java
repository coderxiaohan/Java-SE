package scratch3;

//public class Person {
//    public String name;
//    public int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//        System.out.println("构造方法执行");
//    }
//    {
//        System.out.println("实例代码块执行");
//    }
//    static{
//        System.out.println("静态代码块执行");
//    }
//}

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person：构造方法执行");
    }
    {
        System.out.println("Person：实例代码块执行");
    }
    static{
        System.out.println("Person：静态代码块执行");
    }
}