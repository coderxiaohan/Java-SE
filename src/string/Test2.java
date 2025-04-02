package string;

public class Test2 {
    public static void main(String[] args) {
//        String str1 = "abc";
//        String str2 = "abc";
//        // String 是引用类型, 使用 == 比较, 是判定两个引用保存的地址是否相同 (判定两个引用是否指向同一个对象)
//        System.out.println(str1 == str2); // true

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);  // false
    }
}
