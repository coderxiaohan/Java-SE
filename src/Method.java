import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

//          计算n的阶乘
//        int n = 5;
//        int sum = 0;
//        for(int i = 1;i <= n; i++){
//            int res = fac(i);
//            sum = sum + res;
//        }
//        System.out.println(sum);

////        求最大值方法的重载:在同一类中,方法名相同, 形参类型不同或者形参个数不同
////        在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？
//        int maxInt = maxNum(3,4);
//        System.out.println("两个整数中的最大值为:" + maxInt);
//        double maxDouble = maxNum(2.1,5.8,3.4);
//        System.out.println("两个整数中的最大值为:" + maxDouble);

////        递归求 N 的阶乘
//        int res = fac(5);
//        System.out.println(res);

////        递归求 1 + 2 + 3 + ... + 10
//        int n = 10;
//        int res = sum(n);
//        System.out.println(res);

//        //        求斐波那契数列的第n项。(迭代实现)
//        int n = 5;
//        int res = fab2(n);
//        System.out.println(res);

//        //        写一个递归方法，输入一个非负整数，返回组成它的数字之和
//        System.out.print("输入一个非负整数:");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int sum = add(num);
//        System.out.println(sum);

        //        按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)    （递归）
//        print1(1234);
        print2(23456);

    }
    public static void print2(int n){
        if(n < 10){
            System.out.println(n);
            return;
        }
        print2(n / 10);
        System.out.println(n % 10);
    }

//        public static void print1(int n){
//        if(n > 9){
//            print1(n / 10);
//        }
//        System.out.println(n % 10);
//    }

//    public static int add(int n){
//        if(n > 9){
//            return add(n / 10) + n % 10;
//        }
//        return n % 10;
//    }

//        public static int fab2(int n){
//        if(n == 1 || n == 2){
//            return 1;
//        }
//        int last2 = 1;
//        int last1 = 1;
//        int cur = 0;
//        for(int i = 3; i <= n; i++ ){
//            cur = last1 + last2;
//            last2 = last1;
//            last1 = cur;
//        }
//        return cur;
//    }

//    public static int sum(int n){
//        if(n == 1){
//            return 1;
//        }
//        return sum(n-1) + n;
//    }
//    public static int fac(int n){
//        if(n == 1){
//            return 1;
//        }
//        return n * fac(n-1);
//    }

//    public static int maxNum(int a, int b){
//        return a < b ? a : b;
//    }
//    public static double maxNum(double a, double b,double c){
//        double max = a >= b ? a : b; // max为a和b中的大值
//        return max >= c ? max : c;
//    }

//    public static int fab1(int n){
//        if(n == 1 || n == 2){
//            return 1;
//        }
//        return fab1(n-1) + fab1(n-2);
//    }



//    public static int fac(int num){
//        if(num == 1){
//            return 1;
//        }
//        return num * fac(num - 1);  // 迭代标识
//    }

}
