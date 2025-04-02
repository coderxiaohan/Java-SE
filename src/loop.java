import java.util.Random;
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
////         求一个整数，在内存当中存储时，二进制1的个数
//        System.out.println("请输入一个整数");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int count = 0;
//        for(int i = 0;i<32;i++){
//            if(((num>>i) & 1) == 1){
//                count++;
//            }
//        }
//        System.out.println(count);

////        给定两个数，求这两个数的最大公约数 例如：输入：20 40 输出：20
//        System.out.println("输入两个整数：");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int m = a < b ? a : b;
//        int max = 0;
//        for(int i = m; i >= 1; i--){
//            if(a % i == 0 && b % i == 0){
//                max = i;
//                break;
//            }
//        }
//        System.out.println(max);

//        求出0～n之间的所有“水仙花数”并输出。
//        (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
//        如；153＝1^3＋5^3＋3^3，则153是一个“水仙花数“。）
//        System.out.println("输入一个三位数字：");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for(int i = 100; i <= n; i++){
//            int a = i % 10; // 个位
//            int b = i / 10 % 10; //十位
//            int c = i / 100 % 10; //百位
//            if((a * a * a + b * b * b + c * c * c) == i){
//                System.out.println(i);
//            }
//        }

////        输出一个整数的每一位，如：123的每一位是3，2，1
//        System.out.println("输入一个整数：");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.print(num + "的每一位是");
//        while(num != 0){
//            int a = num % 10;
//            if(num / 10 != 0 ){
//                System.out.print(a + ",");
//            }
//            else{
//                System.out.print(a);
//            }
//            num = num / 10;
//        }

////        计算分数的值,计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
//        double res = 0;
//        for(int i = 1; i <= 100; i++ ){
//            double num = 0;
//            if(i % 2 == 0){
//                // 偶数
//                num =  1.0 / i;
//            }else{
//                num = 1.0 / i;
//                res = res + num;
//            }
//        }
//        System.out.println(res);

////        实现猜数字游戏
//        Random random = new Random(); //默认随机种子数为系统时间
//        int realNum = random.nextInt(100);
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.print("请输入一个整数：");
//            int guessNum = scanner.nextInt();
//            if(guessNum > realNum){
//                System.out.println("猜大了");
//            } else if (guessNum <realNum) {
//                System.out.println("猜小了");
//            }else{
//                System.out.println("猜对了");
//                break;
//            }
//        }

//        编写代码模拟三次密码输入的场景。
//        最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
        System.out.print("请输入三位数密码：");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        int realCode = 123;
        int num = 3;
        while(num > 1){
            if(code == realCode){
                System.out.println("登录成功");
                break;
            }
            else{
                System.out.print("密码错误，请重新输入：");
                code = scanner.nextInt();
            }
            num--;
        }
        if(num == 1){
            System.out.println("退出程序");
        }


    }
}

