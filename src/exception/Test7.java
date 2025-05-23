package exception;

public class Test7 {
    public static void main(String[] args) {
        try{
            System.out.println("try代码");
//            int a = 10 / 0;
            return;
        }catch (Exception e){
            System.out.println("catch代码");
        }finally {
            System.out.println("try-catch代码");
        }
    }
}
