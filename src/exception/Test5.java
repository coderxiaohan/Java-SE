package exception;

public class Test5 {
    public static void main(String[] args) {
        try{
//            int a = 10 / 0;
            String s = null;
            System.out.println(s.length());
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
            // 不是很常见, 一般都会给不同的异常提供不同的处理方式.
            System.out.println("同时捕获三种类型的异常");
        }catch(Exception e){
            System.out.println("捕获异常");
        }
    }
}
