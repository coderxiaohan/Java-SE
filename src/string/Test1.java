package string;

public class Test1 {
    public static void main(String[] args) {
        //构造String对象
        //1. 直接通过字面值常量来构造
        String s1 = "hello";
        //2. 通过new的方式来构造，String也是类
        String s2 = new String("hello");
        //3. 通过字符数组来构造String
        char[] chars = {'h','e','l','l','o'};
        String s3 = new String(chars);
    }
}
