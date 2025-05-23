package exception;

public class Test2 {
    private static double divide(double a, double b){
        if(b == 0){
            throw new ArithmeticException("不能用0作为除数");
        }
        return a / b;
    }
    private static void func1(){
//        try{
            System.out.println(divide(10, 0));
//        }catch(ArithmeticException e){
//            System.out.println("func1捕获异常");
//        }

    }
    private static void func2(){
//        try{
            func1();
//        }catch (ArithmeticException e){
//            System.out.println("func2捕获异常");
//        }
    }
    public static void main(String[] args) {
        System.out.println("抛出异常前");
        try{
            //把可能抛出异常的代码放到try中
            func2();
        }catch(ArithmeticException e){
            //针对异常实现处理逻辑
//            System.out.println("异常已经捕获到了");
            e.printStackTrace();
        }
        System.out.println("抛出异常后");
    }
}


