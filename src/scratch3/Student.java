package scratch3;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
        System.out.println("Student: 构造方法执行");
    }
    {
        System.out.println("Student: 实例代码块执行");
    }
    static{
        System.out.println("Student：静态代码块执行");
    }
}
