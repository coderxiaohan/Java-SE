package boke;

public class Test {
    public int n = 10;
    public int m = 20;

    public static void main(String[] args) {
        Test t1 =  new Test();
        t1.n = 100;
        t1.m = 200;

        Test t2 = new Test();
        t2.n = 1000;
        t2.m = 2000;
        System.out.println("t1.n=" + t1.n );
        System.out.println("t1.m=" + t1.m );
        System.out.println("t2.n=" + t2.n );
        System.out.println("t2.m=" + t2.m );
    }
}
