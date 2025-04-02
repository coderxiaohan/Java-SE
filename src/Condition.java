import java.sql.SQLOutput;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

//        System.out.println("请输入一个数字：");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        if(num % 2 == 0){
//            System.out.println("偶数");
//        }else{
//            System.out.println("奇数");
//        }

//        // 判断闰年
//        System.out.println("请输入年份：");
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
//        if(year % 100 == 0){
//            if(year % 400 == 0){
//                System.out.println(year+" 是闰年");
//            }else{
//                System.out.println(year+" 不是闰年");
//            }
//        } else{
//            if(year % 4 == 0){
//                System.out.println(year+" 是闰年");
//            }else{
//                System.out.println(year+" 不是闰年");
//            }
//        }

        // 输出 1000 - 2000 之间所有的闰年
        int year = 1000;
        while(year<=2000){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year);
                }
            } else{
                if(year % 4 == 0){
                    System.out.println(year);
                }
            }
            year++;
        }


//        // 浮点数判断相等
//        double gap = 0.0000000000000000001;
//        double a = 0.1;
//        double b = 0.2;
//        if((a + b - 0.3) < gap && (a + b - 0.3) > -gap){
//            System.out.println("相等");
//        }else{
//            System.out.println("不等");
//        }

//        // switch case
//        System.out.println("请输入一个1——7之间的数");
//        Scanner scanner = new Scanner(System.in);
//        int day = scanner.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("星期一");
//                break;
//            case 2:
//                System.out.println("星期二");
//                break;
//            case 3:
//                System.out.println("星期三");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }
    }
}
