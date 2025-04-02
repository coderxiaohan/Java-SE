package string;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        System.out.println(s1.indexOf("cdf"));  // -1
        String s = "abcabcabc";
        System.out.println(s.indexOf("abc"));  // 0
        System.out.println(s.lastIndexOf("abc")); // 6
    }
}
