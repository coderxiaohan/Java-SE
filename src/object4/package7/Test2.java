package object4.package7;

public class Test2 {
    private int n = 10;
    private static int staticN = 100;

    // 静态内部类
    static class Inner{
        private int m = 20;
        public void fun(){
            System.out.println("m = " + m);
            // 静态内部类无法访问的到外部类的实例属性，但可以访问到静态属性
//            System.out.println("n = "+ n);
            System.out.println("staticN = "+ staticN);
        }
    }

    public static void main(String[] args) {
        // 可以创建静态类的实例
        Inner inner = new Inner();
        inner.fun();

    }
}

