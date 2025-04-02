public class Test {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        char c = '中';
//        System.out.println(c);
//        int a = 10;
//        //黄色波浪线表示溢出
//        long b = 1_0000_00000_0000L;

//        // int型变量所能表示的范围
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

//        //类型转换
//        int a = 10;
//        long b = 20L;
//        b = a; // 可以编译通过
//        a = b; // 编译失败

//        // 字符串类型
//        String name = "I love study";
//        System.out.println(name);
//
//        // 数字转换为string类型
//        // 方法一
//        int a = 10;
//        String s1 = a + " ";
//        System.out.println(s1);
//        //方法二
//        String s2 = String.valueOf(a);
//        System.out.println(s2);

        //string类型转换为数字
        String str = "10";
        int num = Integer.parseInt(str);  //java命名主要使用小驼峰
        String str2 = "5.0";
        double x = Double.parseDouble(str2);
        System.out.println(x);

//        short a =128;
//        System.out.println(a);
//        byte b =(byte) a;
//        System.out.println(b);


    }
}
