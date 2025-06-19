package scratch7;

//删除字符

//输入两行字符，在第一行字符中删除第二行出现的字符

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        for(int i = 0; i < str1.length(); i++){
            char o = str1.charAt(i);
            boolean flag = true;
            for(int j = 0; j < str2.length(); j++){
                char c = str2.charAt(j);
                if( o == c){
                    flag = false;
                }
            }
            if(flag == true){
                sb.append(o);
            }
        }
        System.out.println(sb);
    }
}
