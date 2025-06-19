package scratch7;


import scratch3.Student;

public class Test {
    public static void main(String[] args) {
        String str = "  hello world  ";
        System.out.println("["+str+"]");
        System.out.println("["+str.trim()+"]");




//        String str = "HelloWorld";
//        System.out.println(str.substring(0));  //HelloWorld
//        System.out.println(str.substring(0,5));  //Hello
//        //字符串的拆分
//        String s = "C++,Java,Python,C#,Javascript";
//        String[] languages = s.split(",");
//        for(String language : languages){
//            System.out.println(language);
//        }

//        //格式化
//        String s = String.format("%d-%d-%d",2025,6,14);
//        System.out.println(s);

//        String s = "hello";
//        //字符串转数组
//        char[] ch = s.toCharArray();
//        for(int i = 0; i < ch.length; i++){
//            System.out.println(ch[i]);
//        }
//        System.out.println();
//        //数组转字符串
//        String s2 = new String(ch);
//        System.out.println(s2);


//        //大小写转换
//        String s1 = "hello";
//        String s2 = "HELLO";
//        // 小写转大写
//        System.out.println(s1.toUpperCase());
//        // 大写转小写
//        System.out.println(s2.toLowerCase());

//        // 数字转字符串
//        String s1 = String.valueOf(123);
//        String s2 = String.valueOf(12.3);
//        String s3 = String.valueOf(true);  //true
//        String s4 = String.valueOf(new Student("xiaobai", 18)); //scratch3.Student@404b9385
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println("==================================");
//        //字符串转数字
//        //注意：Integer、Double等是Java中的包装类型，这个后面会讲到
//        int data1 = Integer.parseInt("123");
//        double data2 = Double.parseDouble("12.3");
//        System.out.println(data1);
//        System.out.println(data2);


//        String s = "aaaabbbbbccccccaaaabbbbbcccccc";
//        System.out.println(s.charAt(0));
//        System.out.println(s.indexOf("c"));
//        System.out.println(s.indexOf("c",10));

//        String s1 = new String("abc");
//        String s2 = new String("ac");
//        String s3 = new String("abc");
//        String s4 = new String("abcdef");
//        System.out.println(s1.compareTo(s2)); //不同输出字符差值-1
//        System.out.println(s1.compareTo(s3)); //相同输出0
//        System.out.println(s1.compareTo(s4)); //前k个字符完全相同，输出长度差值 -3

//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        String s3 = new String("Hello");
//
//        // s1、s2、s3引用的是三个不同对象，因此==比较结果全部为false
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//
//        // equals比较：String对象中的逐个字符
//        // 虽然s1与s2引用的不是同一个对象，但是两个对象中放置的内容相同，因此输出true
//        // s1与s3引用的不是同一个对象，而且两个对象中内容也不同，因此输出false
//        System.out.println(s1.equals(s2));  //true
//        System.out.println(s1.equals(s3));  //false


//        int a = 10;
//        int b = 20;
//        int c = 30;
//
//        // 对于基本类型变量，==比较两个变量中存储的值是否相同
//        System.out.println(a == b);
//        System.out.println(a == c);
//
//        // 对于引用类型变量，==比较两个引用变量引用的是否为同一个对象
//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        String s3 = new String("world");
//        String s4 = s1;
//        System.out.println(s1==s2);  //false
//        System.out.println(s2==s3);  //false
//        System.out.println(s1==s4);  //true

//        //使用常量串构造
//        String s1 = "Hello";
//        System.out.println(s1);
//
//        //直接new string对象
//        String s2 = new String("Hello");
//        System.out.println(s2);
//
//        //使用字符数组进行构造
//        char[] array = {'H', 'e','l','l','o'};
//        String s3 = new String(array);
//        System.out.println(s3);

//        s1和s2引用的是不同对象 s1和s3引用的是同一对象
//        String s1 = new String("Hello");
//        String s2 = new String("World");
//        String s3 = s1;
//
//        System.out.println(s1.length());  // 获取字符串长度---输出5
//        System.out.println(s1.isEmpty());  // 如果字符串长度为0，返回true，否则返回false


    }
}





