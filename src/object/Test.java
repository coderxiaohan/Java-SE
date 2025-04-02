package object;

public class Test {
    // 实例属性
    public int m = 100;
    // 类（静态）属性
    public static int n = 200;
    // 实例方法：可以调用实例属性、实例方法和类属性类方法
    public void fun1(){
        System.out.println("m = "+ m );
        System.out.println("n = "+ n);
    }
    // 类方法：不能调用实例属性和实例方法
    public static void fun2(){
//        System.out.println("m = "+ m);
        System.out.println("n = "+ n);
    }


    public static void main(String[] args) {
        Test test1 = new Test();

        System.out.println(Test.n);
        test1.m = 200;
        test1.n = 1000;

        Test test2 = new Test();
        test2.m = 300;
        test2.n = 4000;

        test1.fun1();
        test2.fun2();

    }

}
