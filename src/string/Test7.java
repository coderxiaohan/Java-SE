package string;

import java.util.Locale;

public class Test7 {
    public static void main(String[] args) {
//        int n = 10;
//        double n = 10.5;

//        Boolean n = false;

//        String s1 = "" + n;
//        System.out.println(s1);
//
//        String s2 = String.valueOf(n); // 数字转为字符串
//        System.out.println(s2);

//        String s = "10";
//        int n = Integer.parseInt(s);
//        System.out.println(s + 10);  //1010,而不是20
//        System.out.println(n + 10); // 20

//        String s = "Hello";
//        String s1 = s.toUpperCase();
//        System.out.println(s1);
//        String s2 = s.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s);

//        //字符串转数组
//        String s = "你好";
//        //通过toCharArray转为字符数组
//        char[] chars = s.toCharArray();
//        for(char c : chars){
//            System.out.println(c);
//        }
//
//        byte[] bytes = s.getBytes();
//        for(byte b : bytes){
//            System.out.printf("%x\n", b);
//        }

//        //  格式化
//        int x = 10;
//        System.out.printf("x = %d\n", x);
//        String s = String.format("x = %d\n", x);
//        System.out.println(s);

//        // 字符串替换
//        String s = "大家今天过的很开心";
//        // replace 是替换所有的字符. 替换的结果是新的字符串.
//        String s2 = s.replace("大家","小红");
//        System.out.println(s);
//        System.out.println(s2);

//        //字符串拆分
//        String s = "C++.Java.Python.C#.Javascript";
//        String[] languages = s.split("\\.");
//        for( String language : languages){
//            System.out.println(language);
//        }

//        // 字符串截取
//        String s = "abcdefg";
//        System.out.println(s.substring(2)); //cdefg
//        System.out.println(s.substring(2, 4)); //cd
////        System.out.println(s.substring(2,8)); //越界报错
//        // 虽然要求下标得是在合理范围, 但是 7 特殊. 取子串并不或访问 7 这个下标的元素.
//        System.out.println(s.substring(2,7));

        // 上述操作不会修改 s 字符串本身. 都是生成新的字符串.

//        String s = "          \f      Hello World!      \n\t        ";
//        String s2 = s.trim();
//        System.out.println("[" + s + "]");
//        System.out.println("[" + s2 + "]");

//        String s = new String("Hello");
//        // 此时 s2 的内容也是 "hello", 但是是指向常量池中的 "hello"
//        String s2 = s.intern();
//        System.out.println(s == "Hello");  //false
//        System.out.println(s2 == "Hello");  //true

//        // Java 中提供的 "不可变的字符串"
//        long beg = System.currentTimeMillis();
//        String s = "hello";
//        for(int i = 0; i < 10_0000; i++){
//            s += i;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - beg);  //2794
//        System.out.println(s);
//
//        // Java 还提供了可变的字符串 StringBuilder. 用法和 String 非常相似. 可以方便的和 String 相互转换.
//        // 但是这个东西可以修改.
//        // 记录程序开始的时间戳, 单位是毫秒.
//        StringBuilder stringBuilder = new StringBuilder("Hello");
//        long beg = System.currentTimeMillis();
//        for(int i = 0; i < 100_0000; i++){
//            // 类似于 String 的 += 这个过程不会创建新的 StringBuilder 对象, 都是针对同一个对象操作的.
//            stringBuilder.append(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - beg); //20
////        System.out.println(stringBuilder);

    }
}
