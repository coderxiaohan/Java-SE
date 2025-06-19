package scratch7;
//输入两个字符串a和b，字符串内容为二进制数字，求两个字符串相加的结果，
// 加法计算方法以二进制方式计算，并返回对应的字符串结果。要求程序尽可能的高效。
//  字符串长度不超过100。

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();  //1101
        String str2 = scanner.nextLine();  //1100
        String result = add(str1, str2);
        System.out.println(result);

    }
    public static String add(String strA, String strB){
        StringBuilder s1 = new StringBuilder(strA);
        StringBuilder s2 = new StringBuilder(strB);
        s1.reverse();
        s2.reverse();
        int maxLen = s1.length() > s2.length() ? s1.length() : s2.length();
        StringBuilder result = new StringBuilder();
        boolean add = false; // 是否进位
        for(int i = 0; i < maxLen; i++ ){
            // i有可能要比最短的字符串还有长，容易发生数组越界
            char charA = i >= s1.length() ? '0' : s1.charAt(i);
            char charB = i >= s2.length() ? '0' : s2.charAt(i);

            if(charA == '0' && charB == '0'){
                if(add){
                    result.append('1');
                }else{
                    result.append('0');
                }
                add = false;
            }else if(charA == '1' && charB == '1'){
                if(add){
                    result.append('1');
                }else{
                    result.append('0');
                }
                add = true;
            }else if(charA == '0' && charB == '1'){
                if(add){
                    result.append('0');
                }else{
                    result.append('1');
                }

            }else if(charA == '1' && charB ==  '0'){
                if(add){
                    result.append('0');
                }else{
                    result.append('1');
                }
            }
        }
        // 判断最后一位
        if(add){
            result.append('1');
        }
        result.reverse();
        return result.toString();
    }
}
