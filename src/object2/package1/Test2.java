package object2.package1;

public class Test2 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        //defaut这样的属性是可以被同一包的其他类使用
        System.out.println(test.x);

    }
}
