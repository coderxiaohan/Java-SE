package object2.finaltest;

public class Test {
    //final类似于c中的const,不能随意修改值
    private  final int x = 20;
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t.x);

        String s;
    }
}
