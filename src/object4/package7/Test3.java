package object4.package7;

public class Test3 {
    public void func(){
        // 方法执行到的时候，才会创建这个类
        class Inner{
            private int m = 20;
            public void printM(){
                System.out.println("m = " + m);
            }
        }
        // 在方法内部创建实例
        Inner inner = new Inner();
        inner.printM();
    }
}
