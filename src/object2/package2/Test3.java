package object2.package2;

import object2.package1.Test1;

public class Test3 {
    public static void main(String[] args) {

        Test1 test = new Test1();
        // 由于x是defaut级别的，在其他包中的类是无法访问的
//        System.out.println(test.x);
    }
}
