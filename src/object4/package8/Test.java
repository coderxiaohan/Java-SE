package object4.package8;

public class Test {
    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "hello";
//        // 针对上述这样的两个 String, 比较引用确实是相等的.
//        System.out.println(s1 == s2);
//
//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        // 比较两个引用的指向是否是相同的.
//        System.out.println(s1 == s2);
//        // 比较内容, 就可以使用 equals 方法
//        System.out.println(s1.equals(s2));

        Student s1 = new Student(1,"张三",90);
        Student s2 = new Student(1,"张三",90);
        System.out.println(s1 == s2);

        // 需要对比内容. 需要根据具体的类, 重写 equals 方法的.
        // Object 中默认的 equals 还是比较 ==
        System.out.println(s1.equals(s2));



    }
}
