package string;

public class Test3 {
    public static void main(String[] args) {
        // 针对两个 String 引用来进行 equals
//        String s1 = "hello";
//        String s2 = new String("hello");
//        System.out.println(s1.equals(s2)); //true

//        // 也可以针对 String 字面值常量来 equals
//        String s = null;
//        // 这两个写法, 更推荐写成第二种写法;
//        System.out.println(s.equals("hello"));
//        System.out.println("hello".equals(s));

        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));

    }
}
