package string;

public class Test4 {
    public static void main(String[] args) {
        String s1 = "AAA";
        String s2 = "aaa";
        System.out.println(s1.compareTo(s2)); //-32
        System.out.println(s1.compareToIgnoreCase(s2)); //0
    }
}
