package object4.package7;

import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        // 需要给 Test4 这个类, 创建 Comparator 比较器
        Comparator<Test4> comparator = new Comparator<Test4>() {
            @Override
            public int compare(Test4 o1, Test4 o2) {
                return 0;
            }
        };
        Test4 t1 = new Test4();
        Test4 t2 = new Test4();
        int ret = comparator.compare(t1,t2);
        System.out.println(ret);
    }
}
