package object4.package7;

public class Test {
    private int n = 10;

    public void printN(){
        System.out.println(n);
    }

    public void fun(){
        Inner inner = new Inner();
        inner.printM();
    }

    public static void func2(){
        // 在 外部类 的方法中使用内部类, 不用加 Test. 如果是其他类就需要了.
        // 由于是静态方法, 所以没有 this, 就无法创建内部类的实例了.
//        Inner inner = new Inner();
    }

    // 这个就是一个普通内部类.
    // 普通内部类创建实例, 是依赖外部类的 this 引用的.
    // 内部类前面不能写 public
    class Inner{
        private int m = 20;

        public void printM(){
            System.out.println(m);
            //内部类可以访问外部类的属性. 即使 private 的.
            // 也可以使用外部类的方法.
            // 这也是为啥, 内部类的实例需要依赖外部类的 this
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.fun();
    }
}
