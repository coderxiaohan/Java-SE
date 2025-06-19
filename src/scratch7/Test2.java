package scratch7;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.next();

            String str2 = str.toLowerCase();

            int length = str2.length();

            for(int i =0; i < str2.length(); i++){
                if(str2.charAt(i) != ' '){
                    System.out.print(str2.charAt(i));
                    System.out.print("\n");
                }
            }
        }
    }
}
